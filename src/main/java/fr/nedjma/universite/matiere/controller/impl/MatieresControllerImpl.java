package fr.nedjma.universite.matiere.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.nedjma.universite.enseignant.domain.Enseignant;
import fr.nedjma.universite.enseignant.service.impl.EnseignantServiceImpl;
import fr.nedjma.universite.matiere.controller.IMatieresController;
import fr.nedjma.universite.matiere.domain.Matieres;
import fr.nedjma.universite.matiere.service.impl.MatieresServiceImpl;

@Controller
public class MatieresControllerImpl implements IMatieresController {

	@Autowired
	MatieresServiceImpl matieresService;

	@Autowired
	EnseignantServiceImpl enseignantService;

	@Override
	@GetMapping("matieres")
	public String FindAll(Model model) {
		List<Matieres> liste = matieresService.findAll();
		model.addAttribute("listeMatieres",liste);
		return "/matieres/matieres";
	}

	@Override
	@GetMapping("matieres-infos")
	public String findOne(Model model, @RequestParam ("id") Integer id) {
		Matieres mat = matieresService.findOne(id);
		model.addAttribute("uneMatiere", mat);
		return "/matieres/matieresInfos";
	}

	@Override
	@GetMapping("matieres-ajouter")
	public String addOne(Model model) {
		Matieres mat = new Matieres();
		model.addAttribute("matieres", mat);
		//dans matiere j'ai besoin d'applerla liste des enseignants. Il faut ajouter un autowired serviceEnseignant
		List<Enseignant> liste = enseignantService.findAll();
		model.addAttribute("listeEnseignant", liste);
		return "/matieres/matieresAjouter";
	}

	@Override
	@PostMapping("matieres-valider")
	public String addValid(Model model, @ModelAttribute("matieres") Matieres matieres) {
		Matieres mat = matieresService.add(matieres);
		//condition si le formulaire n'est pas rempli
		if(mat == null) {
			return "redirect:/matieres-ajouter" ;
		}else {
			return "redirect:matieres";
		}
	}



	// request param : modifidier?id=14 : id c'est un parametre et 14 est sa valeur
	//on lui dit qu'on va recevoir un parametre id
	@Override
	@GetMapping("matieres-supprimer")
	public String supprOne(Model model, @RequestParam ("id")Integer id) {
		//'"id" nom du parametre qu'on va injecter dans cette variable. Si on avait appelé id "identifiant" , Integer id et 
		//si on aurait mi : modifier? NOMBRE = 14 dans notre html il aurait fallu mettre @requestParam ("nombre") Integer id

		matieresService.suppr(id);

		return "redirect:matieres";
	}

	@Override
	@GetMapping("matieres-modifier")
	public String modifOne(Model model, @RequestParam ("id") Integer id) {
		Matieres mat = matieresService.findOne(id);
		model.addAttribute("matieres", mat);
		
		List<Enseignant> liste = enseignantService.findAll();
		model.addAttribute("listeEnseignant", liste);
		return "matieres/matieresModifier";
	}

	@Override
	@PostMapping("matieres-modif")
	public String modifValid(Model model, @ModelAttribute("matieres") Matieres matieres) {
		Matieres m = matieresService.modif(matieres);
		if(m == null) {
			return "redirect:/matieres";
		}else {
		return "redirect:matieres";
	}
	}

}
