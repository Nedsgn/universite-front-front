package fr.nedjma.universite.note.domain;



import java.io.Serializable;

//il faut dire a jpa que c'es un sous ensemble d'une autre entité, elle est là que pour etre utilisée dans une autre entité


//serializable : cet objet java on peut le transformer en n'imorote quel langage : json par ex....
public class NotePK implements Serializable{

	

	private Integer etudiant;
	

	private Integer matiere;

	public Integer getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Integer etudiant) {
		this.etudiant = etudiant;
	}

	public Integer getMatiere() {
		return matiere;
	}

	public void setMatiere(Integer matiere) {
		this.matiere = matiere;
	}
	
	
}
