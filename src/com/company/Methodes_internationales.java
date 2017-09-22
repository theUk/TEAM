package com.company;


public class Methodes_internationales {
    private  int charg_trav;
    private double taux_max;
    private double val_sal;
    private int nbr_dr_anc;
    private int nbr_diplome;
    private static double[] tab_inter= new double[3];

    public static double[] getTab_inter() {
        return tab_inter;
    }

    public void setTab_inter(double[] tab_inter) {
        this.tab_inter = tab_inter;
    }

    public int getNbr_diplome() {
        return nbr_diplome;
    }

    public void setNbr_diplome(int nbr_diplome) {
        this.nbr_diplome = nbr_diplome;
    }

    public int getNbr_dr_anc() {
        return nbr_dr_anc;
    }

    public void setNbr_dr_anc(int nbr_dr_anc) {
        this.nbr_dr_anc = nbr_dr_anc;
    }

    public double getVal_sal() {
        return val_sal;
    }

    public void setVal_sal(double val_sal) {
        this.val_sal = val_sal;
    }

    public double getTaux_max() {
        return taux_max;
    }

    public void setTaux_max(double taux_max) {
        this.taux_max = taux_max;
    }

    public int getCharg_trav() {
        return charg_trav;
    }

    public void setCharg_trav(int charg_trav) {
        this.charg_trav = charg_trav;
    }





    public Methodes_internationales(){

    }

    public Methodes_internationales(int charg_trav, double taux_max, double val_sal, int nbr_dr_anc){
        this.charg_trav=charg_trav;
        this.taux_max=taux_max;
        this.val_sal=val_sal;
        this.nbr_dr_anc=nbr_dr_anc;
    }

     private static double salaire_emp(int chrg_trav, double taux_max){
         getTab_inter()[0]=chrg_trav*taux_max;
        return chrg_trav*taux_max;
    }

    public double droit_ancien(int nbr_dr_anc, double val_sal){
        double quinzePrCent=0.0;
        val_sal=salaire_emp(charg_trav,taux_max);
        quinzePrCent=(5*val_sal)/100;
        tab_inter[1]=Math.abs((nbr_dr_anc*quinzePrCent)-5000);
        return Math.abs((nbr_dr_anc*quinzePrCent)-5000);
    }

    public  double montant_diplome(){
        double montant=0.0;
        if(charg_trav<=500)
            montant=500.00;
        if(charg_trav>500)
            montant=1500.00;

        if(montant*(nbr_diplome+2)>5000.00) {
            montant = 5000.00;
        }else{
            montant=montant*(nbr_diplome+2); // pour trouver le montant des diplomes
        }
        tab_inter[2]=montant;

        return montant;
    }


    public static double val_tot(){
        return tab_inter[0]+tab_inter[1]+tab_inter[2];
    }

    public static double  rente_provenciale(double valeur_totale){
        return Math.round(((valeur_totale+9733.70)*7.2)/100);
    }

    public static double  rente_federale(double valeur_fonciere){
        return Math.round(((valeur_fonciere+9733.70)*12.5)/100) ;
    }



}
