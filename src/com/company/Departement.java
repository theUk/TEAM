package com.company;

import java.util.ArrayList;

public class Departement {

    private String nom_departement ;
    private double taux_horaire_min ;
    private double taux_horaire_max ;
    private ArrayList<Employe> employesNationnal = new ArrayList<Employe>();
    private ArrayList<Employe> employesRegionnal = new ArrayList<Employe>();
    private ArrayList<Employe> employesInternationnal = new ArrayList<Employe>();




    public Departement(){
    }

    public Departement(String nom_departement , double taux_horaire_min,double taux_horaire_max  ){

    this.nom_departement = nom_departement ;
    this.taux_horaire_min = taux_horaire_min;
    this.taux_horaire_max = taux_horaire_max ;

    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }


    public double getTaux_horaire_min() {
        return taux_horaire_min;
    }

    public void setTaux_horaire_min(double taux_horaire_min) {
        this.taux_horaire_min = taux_horaire_min;
    }

    public double getTaux_horaire_max() {
        return taux_horaire_max;
    }

    public void setTaux_horaire_max(double taux_horaire_max) {
        this.taux_horaire_max = taux_horaire_max;
    }

    public ArrayList<Employe> getEmployesNationnal() {
        return employesNationnal;
    }

    public void setEmployesNationnal(ArrayList<Employe> employesNationnal) {
        this.employesNationnal = employesNationnal;
    }

    public ArrayList<Employe> getEmployesRegionnal() {
        return employesRegionnal;
    }

    public void setEmployesRegionnal(ArrayList<Employe> employesRegionnal) {
        this.employesRegionnal = employesRegionnal;
    }

    public ArrayList<Employe> getEmployesInternationnal() {
        return employesInternationnal;
    }

    public void setEmployesInternationnal(ArrayList<Employe> employesInternationnal) {
        this.employesInternationnal = employesInternationnal;
    }
}
