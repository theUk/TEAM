package com.company;

public class Methodes_national {

    private int charg_trav;
    private double taux_min;
    private double val_sal;
    private int nbr_dr_anc;
    private double[] tab_nat= new double[2];

    public Methodes_national(int charg_trav, double taux_min, double val_sal, int nbr_dr_anc){
        this.charg_trav=charg_trav;
        this.taux_min=taux_min;
        this.val_sal=val_sal;
        this.nbr_dr_anc=nbr_dr_anc;
    }

    public double salaire_emp(int chrg_trav, double taux_min){
        tab_nat[0]=chrg_trav*taux_min;
        return chrg_trav*taux_min;
    }

    public double droit_ancien(int nbr_dr_anc, double val_sal){
        double cinqPrCent=0.0;
        val_sal=salaire_emp(charg_trav,taux_min);
        cinqPrCent=(5*val_sal)/100;
        tab_nat[1]=Math.abs((nbr_dr_anc*cinqPrCent)-5000);
        return Math.abs((nbr_dr_anc*cinqPrCent)-5000);
    }

    public double montant_diplome(){
        return 0.00;
    }

    public double val_tot(){
        return tab_nat[0]+tab_nat[1];
    }

    public double rente_provenciale(double valeur_totale){
        return Math.round(((valeur_totale+9733.70)*7.2)/100);
    }

    public double rente_federale(double valeur_fonciere){
        return Math.round(((valeur_fonciere+9733.70)*12.5)/100) ;
    }

}
