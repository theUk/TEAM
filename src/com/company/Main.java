package com.company;

//import net.sf.json.JSONObject;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.ArrayList;

public class Main {


    private int test ;

    public static void main(String[] args) {

        //System.out.println(args[0]);
        //System.out.println(args[0]);
        Departement departement = new Departement();

        ArrayList<Departement> departementArrayList= new ArrayList<Departement>();


       // MO2
        InputStream is = null;
            try {
                is = new FileInputStream(args[0]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Object jsonTxt = null;
            try {
                jsonTxt = IOUtils.toString(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(jsonTxt);


       if (jsonTxt.toString().charAt(0) == '[' ) {

           JSONArray jsonArray = JSONArray.fromObject(jsonTxt);
           for (int i = 0; i < jsonArray.size(); i++) {
                departement = new Departement();

               {
                   setDepartement(jsonTxt , departement , departementArrayList);
               }

           }

       }else if (jsonTxt.toString().charAt(0) == '{' ) {
           setDepartement(jsonTxt , departement , departementArrayList);
       }



       ///Bertrant

        JSONObject departement2=new JSONObject();


        double val=Methodes_internationales.val_tot();
        double rentepro=Methodes_internationales.rente_provenciale(val);
        double rentefed=Methodes_internationales.rente_federale(val);
        departement2.accumulate("valeur_totale",val+" %" );
        departement2.accumulate("rente_provenciale",rentepro+" %" );
        departement2.accumulate("rente_federale",rentefed+" %" );

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

        departement2.accumulate("salaire", tableauEmploye);

        System.out.println(departement2);


        //Mozart ajoute



        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("sample.json");   // CHANGER POUR ARGS
            // Writting the departement2 into sample.json
            fileWriter.write(departement2.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }



    static void setDepartement(Object jsonTxt, Departement departement, ArrayList<Departement> departementArrayList){

        JSONObject jsonObject =  JSONObject.fromObject(jsonTxt);

        departement.setNom_departement(jsonObject.getString("nom_departement"));

        String taux_horaire_min = jsonObject.getString("taux_horaire_min").replaceAll(" ", "");
        taux_horaire_min = taux_horaire_min.replace('$',' ').trim();
        departement.setTaux_horaire_min(Double.parseDouble(taux_horaire_min));


        String taux_horaire_max = jsonObject.getString("taux_horaire_max").replaceAll(" ", "");
        taux_horaire_max = taux_horaire_max.replace('$',' ').trim();
        departement.setTaux_horaire_max(Double.parseDouble(taux_horaire_max));

        JSONArray employesJson = jsonObject.getJSONArray("employes") ;
        ArrayList<Employe> employeArrayList = new ArrayList<Employe>();
        Employe employe = new Employe();
        for (int i= 0 ; i < employesJson.size() ; i ++ ){
            employe.setType_departement(jsonObject.getInt("type_departement"));
            employe.setNom(employesJson.getJSONObject(i).getString("nom"));
            employe.setNombre_droit_ancienne(employesJson.getJSONObject(i).getInt("nombre_droit_anciennete"));
            employe.setNombre_diplomes(employesJson.getJSONObject(i).getInt("nombre_diplomes"));
            employe.setCharge_travail(employesJson.getJSONObject(i).getInt("charge_travail"));

            if (employe.getType_departement() == 0 ){

                departement.getEmployesNationnal().add(new Employe(employe));

            }else if (employe.getType_departement()== 1 ){

                departement.getEmployesRegionnal().add(new Employe(employe));


            }else if (employe.getType_departement()== 2 ){

                departement.getEmployesInternationnal().add(new Employe(employe));
            }
        }
        departementArrayList.add(departement);


    }







}
