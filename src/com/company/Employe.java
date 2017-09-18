package com.company;

public class Employe {


    private  String nom  ;
    private String date_revision_salaire = null ;

    private int type_departement ;
    private int nombre_droit_ancienne = 4 ;
    private int nombre_diplomes = 4 ;
    private int charge_travail = 4 ;

    public Employe(){
    }

    public Employe(Employe employe) {
        this.setNom(employe.getNom());
        this.setDate_revision_salaire(employe.getDate_revision_salaire());
        this.setNombre_droit_ancienne(employe.getNombre_droit_ancienne());
        this.setNombre_diplomes(employe.getNombre_diplomes());
        this.setCharge_travail(employe.getCharge_travail());
        this.setType_departement(employe.getType_departement());
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate_revision_salaire() {
        return date_revision_salaire;
    }

    public void setDate_revision_salaire(String date_revision_salaire) {
        this.date_revision_salaire = date_revision_salaire;
    }

    public int getNombre_droit_ancienne() {
        return nombre_droit_ancienne;
    }

    public void setNombre_droit_ancienne(int nombre_droit_ancienne) {
        this.nombre_droit_ancienne = nombre_droit_ancienne;
    }

    public int getNombre_diplomes() {
        return nombre_diplomes;
    }

    public void setNombre_diplomes(int nombre_diplomes) {
        this.nombre_diplomes = nombre_diplomes;
    }

    public int getCharge_travail() {
        return charge_travail;
    }

    public void setCharge_travail(int nombre_travail) {
        this.charge_travail = nombre_travail;
    }

    public int getType_departement() {
        return type_departement;
    }

    public void setType_departement(int type_departement) {
        this.type_departement = type_departement;
    }
}
