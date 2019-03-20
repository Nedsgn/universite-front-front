package fr.nedjma.universite.etudiant.domain;


import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import fr.nedjma.universite.note.domain.Note;

public class Etudiant {
	
	
private Integer id;
	
private Integer numeroEtudiant;
	
	
private String nom;
	
	
private String prenom;
	

	@DateTimeFormat(pattern="yyyy-MM-dd")
private Date dateNaissance;
	

private String sexe;
	

private String photo;
	
	//le jpa le gere avec one to many
	//etudiant est donc la pour spécifier la jointure qu'on a crée dans la class (domain) Note
	//c'ets un lien bi-directionnel d'une jointure déjà existante
	
	//on veut récuperer toute les notes
	private List<Note> notes;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public void setNumeroEtudiant(Integer numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	
	
	
	
}
