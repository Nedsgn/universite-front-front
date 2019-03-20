package fr.nedjma.universite.matiere.repository;

import java.util.List;

import fr.nedjma.universite.matiere.domain.Matieres;

public interface IMatiereRepository {

	List<Matieres> findAll();


	Matieres getOne(Integer id);

	Matieres save(Matieres matieres);

	void deleteById(Integer id);

}
