package fr.matthieu;


public class Voiture {
    String marque;
    String color;
    int gasLvl;
    boolean reservoireVide;
    boolean reservee;
    
    public Voiture (String marque, String color) {
        this.marque = marque;
        this.color = color;
        this.reservoireVide = false;
        this.reservee = false;
    }

    public String getChaine() {
        return "marque: " + getMarque() + ", color: " + getcolor();
    }

    public String getMarque(){
        return this.marque;
    }

    public void setMarque(String marque){
        this.marque = marque;
    }

    public String getcolor(){
        return this.color;
    }

    public void setcolor(String color){
        this.color = color;
    }

    public int getGasLvl(){
        return this.gasLvl;
    }

    public void setGasLvl(int gasLvl){
        this.gasLvl = gasLvl;
    }

    public boolean getReservoirVide(){
        return this.reservoireVide;
    }

    public void setReservoirVide(boolean reservoireVide){
        this.reservoireVide = reservoireVide;
    }

    public boolean getReservee(){
        return this.reservee;
    }

    public void setReservee(boolean reservee){
        this.reservee = reservee;
    }
}
