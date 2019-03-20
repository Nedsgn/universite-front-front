package fr.nedjma.universite.enseignant.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;




public class Enseignant {



	private Integer id;

	private Integer numeroEnseignant;


	private String nom;


	private String prenom;


	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateNaissance;


	private String sexe;


	private String grade;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateEmbauche;


	private String photo;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getNumeroEnseignant() {
		return numeroEnseignant;
	}


	public void setNumeroEnseignant(Integer numeroEnseignant) {
		this.numeroEnseignant = numeroEnseignant;
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


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public Date getDateEmbauche() {
		return dateEmbauche;
	}


	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}





}
