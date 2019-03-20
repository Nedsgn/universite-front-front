
console.log("JS chargé");


function validerFormulaire () {

    let nomElement = document.getElementById("nom");
    let nom = nomElement.value;
    console.log(nom);

    if (nom === "") {
    	console.log("Nom non valide");
        nomElement.classList.add("erreur");
        document.getElementById("labelHidden").style.display = 'block';
    } else {
        nomElement.classList.remove("erreur");
        document.getElementById("labelHidden").style.display = 'none';
    }

    let coefElement = document.getElementById("coef");

    let coef = coefElement.value;

    console.log(coef);

    if (coef === "") {
        coefElement.classList.add("erreur");
       
    } else {
        coefElement.classList.remove("erreur");
       
    }
    
    
    let numMatiereElement = document.getElementById("numeroMatiere");

    let matiere = numMatiereElement.value;

    console.log(matiere);

    if (matiere === "") {
    	numMatiereElement.classList.add("erreur");
    } else {
    	numMatiereElement.classList.remove("erreur");
    }

  
 


let classErreur = document.getElementsByClassName ("erreur"); //on a plusieurs class, tous les elments qui ont cettte class
console.log(classErreur);
console.log("Taille du tableau " + classErreur.length);

if(classErreur.length === 0){
	//il va l'afficher suelment si tous les élement obligatoire sont bien remplis
	console.log("Envoyer le formulaire");
	let ValiderFormulaire = document.getElementById("form");
	ValiderFormulaire.submit();
}


};
