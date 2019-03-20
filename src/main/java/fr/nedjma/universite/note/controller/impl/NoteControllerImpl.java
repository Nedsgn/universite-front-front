package fr.nedjma.universite.note.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.nedjma.universite.etudiant.domain.Etudiant;
import fr.nedjma.universite.etudiant.service.impl.EtudiantServiceImpl;
import fr.nedjma.universite.matiere.domain.Matieres;
import fr.nedjma.universite.matiere.service.impl.MatieresServiceImpl;
import fr.nedjma.universite.note.controller.INoteController;
import fr.nedjma.universite.note.domain.Note;
import fr.nedjma.universite.note.domain.NotePK;
import fr.nedjma.universite.note.service.impl.NoteServiceImpl;

@Controller

public class NoteControllerImpl implements INoteController {

	Logger log = LoggerFactory.getLogger(NoteControllerImpl.class);


	@Autowired
	NoteServiceImpl noteService;
	//on appel le service de l'étudiant et de la matiere pour pouvoir les utiliser dans le html (select...)

	@Autowired
	EtudiantServiceImpl etudiantService;

	@Autowired
	MatieresServiceImpl matieresService;

	@Override
	@GetMapping("/note")
	public String findAll(Model model) {
		List<Note> listeNotes = noteService.findAll();
		model.addAttribute("notes", listeNotes);
		return "/note/note";
	}

	@Override
	@GetMapping("/note-ajouter")
	public String addOne(Model model) {
		List<Etudiant> listeEtudiant = etudiantService.findAll();
		model.addAttribute("listeE", listeEtudiant);

		List<Matieres> listeMatieres = matieresService.findAll();
		model.addAttribute("listeMatiere", listeMatieres);

		Note note = new Note();
		model.addAttribute("note", note);

		return "note/noteAjouter";
	}

	@Override
	@PostMapping("/note-valider")
	public String validOne(Model model, Note note) {
		log.info("Note: {}", + note.getNote());
		log.info("etudiant: {}", note.getEtudiant().getId());
		log.info("matiere : {}" + note.getMatiere().getId());
		log.info("notePK : {}" + note.getNotePk());
		
		NotePK npk = new NotePK();//construire un objet notePk
		//etudiant est l'attribut de notePk (à retrouver dans la classe)
		//npk.setEtudiant(note.getEtudiant().getId());//lui affecter l'id de letudiant
		npk.setMatiere(note.getMatiere().getId());//lui affecter l'id de la matiere de la note
		
		Integer idEtudiant = note.getEtudiant().getId();
		npk.setEtudiant(idEtudiant);
		
		//affecter une valeur a la variable notepk de l'object note
		note.setNotePk(npk);//on insere la nouvelle note dans le npk, npk est un  objet qui a l'interieur id matiere et id etudiant
		//npk pourrait etre un moteur qu'on a crée à parti du moule ( le bean) et on l'injecte dans la voiture via 
		noteService.addOne(note);
		
		
		return "redirect:/note";
	}

	
	
	@Override
	@GetMapping("/note-modif")
	public String modifOne(Model model,@RequestParam("idEtudiant") Integer idEtudiant, @RequestParam("idMatiere")Integer idMatiere) {
		

		Note not = noteService.findOne(idEtudiant, idMatiere);
		model.addAttribute("note", not);	
		
		return "note/noteModifier";
	}

	
	
	@Override
	@PostMapping("/modif-valid")
	public String modifValid(Model model, @ModelAttribute("note") Note note) {
		
		
		
		return "redirect:/note";
	}

	
}
