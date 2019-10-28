package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Voiture;

import java.util.List;

//DAO qui sert a communiquer avec la BD

//Interface
public interface VoitureDao {

//Methodes disponible pour les classes implementant l'interface VoitureDao:

    //affiche tous les produits :
    public List<Voiture> findAll();

    //verifie si l'id correspond a une voiture et l'affiche:
    public Voiture findById(int id);

    // Ajoute la voiture a la liste:
    public Voiture save(Voiture voiture);

    public void delete(int id);
}
