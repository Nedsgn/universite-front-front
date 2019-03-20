package fr.nedjma.universite.note.domain;


import fr.nedjma.universite.etudiant.domain.Etudiant;
import fr.nedjma.universite.matiere.domain.Matieres;


public class Note {
	
	private NotePK notePk;
	

	private Double note;
	

	private Etudiant etudiant;
	
	private Matieres matiere;

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	public Matieres getMatiere() {
		return matiere;
	}

	public void setMatiere(Matieres matiere) {
		this.matiere = matiere;
	}

	public NotePK getNotePk() {
		return notePk;
	}

	public void setNotePk(NotePK notePk) {
		this.notePk = notePk;
	}
	
	
}
