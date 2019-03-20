package fr.nedjma.universite.enseignant.repository.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.nedjma.universite.enseignant.domain.Enseignant;
import fr.nedjma.universite.enseignant.repository.IEnseignantRepository;

// *************c'est ici qu'on appelle le back********

@Repository
public class EnseignantRepositoryImpl implements IEnseignantRepository{

	RestTemplate restTemplate = new RestTemplate();


	@Override
	public List<Enseignant> findAll() { //on va appeler la methode findAll du back
		List<Enseignant> liste = restTemplate.exchange("http://localhost:8080/enseignants", HttpMethod.GET,null, new ParameterizedTypeReference<List<Enseignant>>() {
		}).getBody();//methode exchange qui nous demande 3 parametree. Le null ici nos dit que le findAll nous renvoie aucun parametre
		//le resultat que je vais récupere va etre en json et on veut le mettre en java
		return liste;
	}

	@Override
	public Enseignant getOne(Integer id) {

		Enseignant e = restTemplate.getForObject(
				"http://localhost:8080/enseignants/" + id, Enseignant.class);
		return e;
	}

	@Override
	public void deleteById(Integer id) {
		restTemplate.delete("http://localhost:8080/enseignants/" +id);
	}

	@Override
	public Enseignant save(Enseignant enseignant) {
		//on appelle en post comme dans le controller
		Enseignant e = restTemplate.postForObject("http://localhost:8080/enseignants", enseignant, Enseignant.class);//le type le nom de la variable. l'objet enseignant , lequel ? celui que j'ai reçu dans le formulaire
		//ce que tu va recevoir en json c'est un enseignant.
		
		return e;
	}

	@Override
	public void update(Enseignant enseignant, Integer id) {
		restTemplate.put(
				"http://localhost:8080/enseignants/" + id, 
				enseignant, 
				Enseignant.class);		
	}



}
