public class Methodes_regional {
    private  int charg_trav;
    private double taux_moy;
    private double val_sal;
    private int nbr_dr_anc;
    private int nbr_diplome;
    private double[] tab_reg= new double[3];

    public Methodes_regional(int charg_trav, double taux_moy, double val_sal, int nbr_dr_anc){
        this.charg_trav=charg_trav;
        this.taux_moy=taux_moy;
        this.val_sal=val_sal;
        this.nbr_dr_anc=nbr_dr_anc;
    }

    public double salaire_emp(int chrg_trav, double taux_moy){
        tab_reg[0]=chrg_trav*taux_moy;
        return chrg_trav*taux_moy;
    }

    public double droit_ancien(int nbr_dr_anc, double val_sal){
        double dixPrCent=0.0;
        double droit_ancien_final;
        val_sal=salaire_emp(charg_trav,taux_moy);
        dixPrCent=(5*val_sal)/100;
        tab_reg[1]=Math.abs((nbr_dr_anc*dixPrCent)-5000);
        return Math.abs((nbr_dr_anc*dixPrCent)-5000);
    }

    public  double montant_diplome(){
        double montant=0.0;
        if(charg_trav>500 && charg_trav<=1000)
            montant=500.00;

        if(charg_trav>1000.00)
            montant=1000.00;

        tab_reg[2]=montant*(nbr_diplome+2);
        return montant*(nbr_diplome+2);
    }

    public double val_tot(){
        return tab_reg[0]+tab_reg[1]+tab_reg[2];
    }


}


