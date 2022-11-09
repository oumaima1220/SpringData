package com.Entities;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping(path="/VehiculeTest") 
public class Controleur {
@Autowired 
private VehiculeCRUD V ;

@PostMapping(path="/ajouter") 
public @ResponseBody String AjouterVoiture (@RequestParam String codeInterne, @RequestParam String immatriculation) {
Vehicule n = new Vehicule();
n.setCodeInterne(codeInterne);
n.setImmatriculation(immatriculation);
V.save(n);
return "Ajout à la BD avec succes";
}
@GetMapping(path="/tous")
public @ResponseBody Iterable<Vehicule> affichertous() {
// This returns a JSON or XML with the users
return V.findAll();
}
 
@PostMapping(path="/SupprimerParID") 
public @ResponseBody String SupprimerParIDVoiture (@RequestParam Long id) {
	Vehicule n = new Vehicule();
	n.setId(id);
	V.delete(n);
return "C'est supprimer avec succes ";
}

@GetMapping(path="/trouverParID")
public @ResponseBody Vehicule TrouverParIDVoiture (@RequestParam Long id) {
// This returns a JSON or XML with the users
	Vehicule vehiculeVM = new Vehicule();
	vehiculeVM.setId(id);
	vehiculeVM.setCodeInterne("mm");
	vehiculeVM.setImmatriculation("pp");
	return vehiculeVM;
	}


@GetMapping(path="/trouverParCodeIn&Imm")
public @ResponseBody Vehicule TrouverVoiture (@RequestParam String codeInterne, @RequestParam String immatriculation) {
// This returns a JSON or XML with the users
	Vehicule vehiculeVM = new Vehicule();
	vehiculeVM.setCodeInterne("codeInterne");
	vehiculeVM.setImmatriculation("pp");
	return vehiculeVM;
	}


}