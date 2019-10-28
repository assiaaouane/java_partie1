package com.ecommerce.microcommerce.model;




//Bean: classe "serialisable"representant une voiture
public class Voiture {
    private String marque;
    private String modele;
    private int id;

//constructeur par defaut sans argument:
    public Voiture(){
    }

//constructeur:
    public Voiture(String marque, String modele, int id) {
        this.marque = marque;
        this.modele = modele;
        this.id = id;
    }

//Getter/Setter:
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Methode toString:
    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", id=" + id +
                '}';
    }
}
