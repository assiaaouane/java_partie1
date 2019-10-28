package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Voiture;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


// Classe implementant l'interface VoitureDao:
@Repository //  -> Indique qu'il s'agit d'une classe qui gere les données

public class VoitureDaoImplementation implements VoitureDao {

    //Cette classe communique avec la BD (simuler):
    public static List<Voiture> voitures = new ArrayList<>();

    static{

        voitures.add(new Voiture("Audi", "A3", 1));
        voitures.add(new Voiture("Audi", "A4", 2));
        voitures.add(new Voiture("Audi", "A5", 3));
        voitures.add(new Voiture("Renault", "Clio", 4));
        voitures.add(new Voiture("Renault", "Scenic", 5));
        voitures.add(new Voiture("Audi", "Twingo", 6));
        voitures.add(new Voiture("Peugeot", "308", 7));
        voitures.add(new Voiture("Peugeot", "208", 8));
        voitures.add(new Voiture("Peugeot", "504", 9));

    }

    @Override
    public List<Voiture> findAll() {

        return voitures;
    }

    @Override
    public Voiture findById(int id) {

        for (Voiture voiture : voitures) {
            if(voiture.getId()==id){
                return voiture;
            }

        }

        return null;
    }

    @Override
    public Voiture save(Voiture voiture) {
        voitures.add(voiture);

        return voiture;
    }

    public void delete(int id) {


       voitures.removeIf(voituresupp -> voituresupp.getId()==id);

    }



}
