package fr.nedjma.universite.etudiant.repository.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.nedjma.universite.etudiant.domain.Etudiant;
import fr.nedjma.universite.etudiant.repository.IEtudiantRepository;

@Repository
public class EtudiantRepositoryImpl implements IEtudiantRepository{

	RestTemplate restTemplate = new RestTemplate();


	@Override
	public List<Etudiant> findAll() {
		List<Etudiant> liste = restTemplate.exchange("http://localhost:8080/etudiant", HttpMethod.GET,null, new ParameterizedTypeReference<List<Etudiant>>() {
		}).getBody();	
		return liste;
	}

	@Override
	public Etudiant getOne(Integer id) {
		Etudiant e = restTemplate.getForObject("http://localhost:8080/etudiant/" + id, Etudiant.class);
		return e;
	}

	@Override
	public Etudiant save(Etudiant etudiant) {
		Etudiant e = restTemplate.postForObject("http://localhost:8080/etudiant/", etudiant, Etudiant.class );
		return e;
	}

	@Override
	public void deleteById(Integer id) {
		restTemplate.delete("http://localhost:8080/etudiant/" + id);

	}

	@Override
	public void update(Etudiant etudiant, Integer id) {
		restTemplate.put("http://localhost:8080/etudiant/" + id, etudiant, Etudiant.class);		
	}

	@Override
	public List<Etudiant> searchEtudiant(String s) {
		List<Etudiant> liste = restTemplate.exchange("http://localhost:8080/etudiant/search/" + s, HttpMethod.GET,null, new ParameterizedTypeReference<List<Etudiant>>() {
		}).getBody();	
		return liste;
	}

}
