package fr.nedjma.universite.etudiant.repository;

import java.util.List;

import fr.nedjma.universite.etudiant.domain.Etudiant;

public interface IEtudiantRepository {

	List<Etudiant> findAll();

	Etudiant getOne(Integer id);

	Etudiant save(Etudiant etudiant);

	void deleteById(Integer id);
	
	void update(Etudiant etudiant, Integer id);
	
	List<Etudiant> searchEtudiant(String s);

}
