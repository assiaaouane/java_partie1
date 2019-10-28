package com.ecommerce.microcommerce.model.controller;

import com.ecommerce.microcommerce.dao.VoitureDao;
import com.ecommerce.microcommerce.model.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// Indique a spring que c'est un controleur REST et que chaque méthode va renvoyer directement la réponse en JSON

@RestController

public class VoitureController {

@Autowired
private VoitureDao voitureDao;


//indique l'uri a laquelle la methode doit repondre: /Voitures
@GetMapping(value="Voitures")

// methode GET qui renvoit la liste des mes voitures:
    public List<Voiture> listeVoitures(){

         return voitureDao.findAll();
    }


@GetMapping(value = "Voitures/{id}")

//Voitures/{id}  -> pour afficher une voiture a partir de son id
    public Voiture afficherVoiture(@PathVariable int id) {

//        Voiture voiture = new Voiture("Audi", "A3", id);
//        return voiture;
    return voitureDao.findById(id);
    }


@PostMapping("/Voitures")
    public void addVoiture(@RequestBody Voiture voiture ) {
    voitureDao.save(voiture);

}

@DeleteMapping("/Voitures/{id}")
    public  List<Voiture> deleteVoiture(@PathVariable int id ){
    voitureDao.delete(id);
   return voitureDao.findAll();

}


@PutMapping("/Voitures")
    public void modifyvoiture(@RequestBody Voiture voiture ) {
        voitureDao.delete(voiture.getId());
        voitureDao.save(voiture);

    }
}
