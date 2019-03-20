package fr.nedjma.universite.matiere.controller;

import org.springframework.ui.Model;

import fr.nedjma.universite.matiere.domain.Matieres;

public interface IMatieresController {

	public String FindAll(Model model);
	public String findOne(Model model, Integer id);
	public String addOne(Model model);
	public String addValid(Model model, Matieres matieres);
	public String supprOne(Model model, Integer id);
		public String modifOne(Model model, Integer id);
		public String modifValid(Model model, Matieres matieres);
	
}
