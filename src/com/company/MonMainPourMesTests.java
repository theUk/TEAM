package com.company;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class MonMainPourMesTests {
    public static void main(String[] args) {
        Methodes_internationales methodes_internationales=new Methodes_internationales();
        JSONObject jsonObject=new JSONObject();


        double val=methodes_internationales.val_tot();
        double rentepro=methodes_internationales.rente_provenciale(val);
        double rentefed=methodes_internationales.rente_federale(val);
        jsonObject.accumulate("valeur_totale",val+" %" );
        jsonObject.accumulate("rente_provenciale",rentepro+" %" );
        jsonObject.accumulate("rente_federale",rentefed+" %" );

        JSONArray tableauEmploye=new JSONArray();
        JSONObject emplye=new JSONObject();


        emplye.accumulate("nom", "Zied Zaier" );
        emplye.accumulate("valeur_par_employe","");
        tableauEmploye.add(emplye);
        emplye.clear();

        emplye.accumulate("nom", "Jean Dupon" );
        emplye.accumulate("valeur_par_employe","");
        tableauEmploye.add(emplye);
        emplye.clear();

        emplye.accumulate("nom", "Rose Pascal" );
        emplye.accumulate("valeur_par_employe","");
        tableauEmploye.add(emplye);

        jsonObject.accumulate("salaire", tableauEmploye);



        System.out.println(jsonObject);


    }
}
