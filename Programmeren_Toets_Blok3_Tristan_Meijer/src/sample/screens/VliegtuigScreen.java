package sample.screens;

import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.GUIklassen.VliegtuigGUI;
import sample.backend.RegistratieController;
import sample.backend.Validatie;

public class VliegtuigScreen extends VliegtuigGUI {

    protected RegistratieController rc;

    public VliegtuigScreen(RegistratieController rc){
        //Registratie instantie koppelen
        this.rc = rc;

        Validatie val = new Validatie();

        Stage primaryStage = new Stage();

        maakGuiAan();

        //Set on Action

        //Set on Action
        btnRegistreren.setOnAction(e->{
            //Input opvangen
            String sKenteken = txtKenteken.getText();
            String sBouwjaar = txtBouwjaar.getText();
            String sMerk = txtMerk.getText();
            String sType = txtType.getText();
            String sKilometerstand = txtKilometerstand.getText();
            String sWaarde = txtWaarde.getText();
            String sVliegmaatschappij = txtVliegMaatschappij.getText();
            String sAfmeting =  txtAfmeting.getText();
            String sAantalPassagiers = txtAantalPassagiers.getText();

            txtKenteken.clear();
            txtBouwjaar.clear();
            txtMerk.clear();
            txtType.clear();
            txtKilometerstand.clear();
            txtWaarde.clear();
            txtVliegMaatschappij.clear();
            txtAfmeting.clear();
            txtAantalPassagiers.clear();

            //Validatie uitvoeren op input gebruiker
            if(val.checkOpNummer(sWaarde) == true) {
                int iWaarde = Integer.parseInt(sWaarde);

                //Opslaan functie aanroepen
                rc.opslaanVliegtuig(sKenteken, sBouwjaar, sMerk, sType, iWaarde, sKilometerstand, sVliegmaatschappij, sAfmeting, sAantalPassagiers);
            }
            else{
                val.geefErrorBericht();

            }
        });

        btnTotaalWaardeVliegtuig.setOnAction(e->{
            int totaalWaarde = rc.waardeTotaalVliegtuig();

            overzichtWaardeVliegtuig.setText(String.valueOf(totaalWaarde));

        });


        primaryStage.setTitle("Registratie Vliegtuig");
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
