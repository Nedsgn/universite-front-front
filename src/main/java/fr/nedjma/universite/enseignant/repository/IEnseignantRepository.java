package fr.nedjma.universite.enseignant.repository;

import java.util.List;

import fr.nedjma.universite.enseignant.domain.Enseignant;

public interface IEnseignantRepository {

	List<Enseignant> findAll();

	Enseignant getOne(Integer id);

	void deleteById(Integer id);

	public Enseignant save(Enseignant enseignant);
	
	public void update(Enseignant enseignant, Integer id);

}
