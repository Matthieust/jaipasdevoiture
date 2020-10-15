package fr.matthieu;

public class voiture {
    String  marque;
    String  couleur;
    int     niveauEssence;
    boolean reservoirVide;
    boolean reservee;

    public voiture (String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
        this.reservee = false;
    }

    public String getMarque(){
        return this.marque;  
    }

    public String getCouleur(){
        return this.couleur;
    }

}
