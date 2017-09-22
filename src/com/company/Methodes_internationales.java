package com.company;


public class Methodes_internationales {
    private  int charg_trav;
    private double taux_max;
    private double val_sal;
    private int nbr_dr_anc;
    private int nbr_diplome;
    private double[] tab_inter= new double[3];

    public Methodes_internationales(){

    }

    public Methodes_internationales(int charg_trav, double taux_max, double val_sal, int nbr_dr_anc){
        this.charg_trav=charg_trav;
        this.taux_max=taux_max;
        this.val_sal=val_sal;
        this.nbr_dr_anc=nbr_dr_anc;
    }

    public double salaire_emp(int chrg_trav, double taux_max){
        tab_inter[0]=chrg_trav*taux_max;
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


    public double val_tot(){
        return tab_inter[0]+tab_inter[1]+tab_inter[2];
    }

    public double rente_provenciale(double valeur_totale){
        return Math.round(((valeur_totale+9733.70)*7.2)/100);
    }

    public double rente_federale(double valeur_fonciere){
        return Math.round(((valeur_fonciere+9733.70)*12.5)/100) ;
    }
}
