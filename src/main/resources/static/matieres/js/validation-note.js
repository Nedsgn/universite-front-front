
console.log("JS chargé");


function validerFormulaire () {

    let noteElement = document.getElementById("note");
    let note = noteElement.value;
    console.log(note);

    if (note === "") {
    	console.log("Note non valide");
        noteElement.classList.add("erreur");
        document.getElementById("labelHidden").style.display = 'block';
    } else {
        noteElement.classList.remove("erreur");
        document.getElementById("labelHidden").style.display = 'none';
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
