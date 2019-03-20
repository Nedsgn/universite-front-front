package fr.nedjma.universite.matiere.domain;

import java.util.List;

import fr.nedjma.universite.enseignant.domain.Enseignant;
import fr.nedjma.universite.note.domain.Note;

public class Matieres {

	
	private Integer id;

	
	private Integer numeroMatiere;


	private String nom;


	private Integer coef;

	private Enseignant enseignant;//on veut un enseignant complet
	

	private List<Note> notes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroMatiere() {
		return numeroMatiere;
	}

	public void setNumeroMatiere(Integer numeroMatiere) {
		this.numeroMatiere = numeroMatiere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCoef() {
		return coef;
	}

	public void setCoef(Integer coef) {
		this.coef = coef;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}





}
