package fr.nedjma.universite.note.controller;

import org.springframework.ui.Model;

import fr.nedjma.universite.note.domain.Note;
import fr.nedjma.universite.note.domain.NotePK;

public interface INoteController {

	public String findAll(Model model);
	public String addOne(Model model);
	public String validOne(Model model, Note note);
	public String modifOne(Model model,Integer etudiant, Integer matiere);
	public String modifValid(Model model, Note note);
}
