package sample.screens;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import sample.GUIklassen.AutoGUI;
import sample.backend.RegistratieController;
import sample.backend.Validatie;

public class AutoScreen extends AutoGUI {

    protected RegistratieController rc;

    public AutoScreen(RegistratieController rc){
        //Registratie Controller instantie koppelen
        this.rc = rc;

        //Maak nieuwe stage aan
        Stage primaryStage = new Stage();

        //Nieuew Validatie instantie aanmaken
        Validatie val = new Validatie();

        //Scene methode oproepen
        maakGuiAan();

        //Set on Action
        btnRegistreren.setOnAction(e->{
            //Input opvangen
            String sKenteken = txtKenteken.getText();
            String sBouwjaar = txtBouwjaar.getText();
            String sMerk = txtMerk.getText();
            String sType = txtType.getText();
            String sKilometerstand = txtKilometerstand.getText();
            String sWaarde = txtWaarde.getText();
            String sMotorInhoud = txtMoterInhoud.getText();
            String sAantalDeuren =  txtAantalDeuren.getText();
            String sBrandstof = txtBrandstof.getText();

            //velden leegmaken
            txtKenteken.clear();
            txtBouwjaar.clear();
            txtMerk.clear();
            txtType.clear();
            txtKilometerstand.clear();
            txtWaarde.clear();
            txtMoterInhoud.clear();
            txtAantalDeuren.clear();
            txtBrandstof.clear();

            //Validatie uitvoeren op input gebruiker
            if(val.checkOpNummer(sWaarde) == true) {
                int iWaarde = Integer.parseInt(sWaarde);

                //Opslaan functie aanroepen
                rc.opslaanAuto(sKenteken, sBouwjaar, sMerk, sType, iWaarde, sKilometerstand, sMotorInhoud, sBrandstof, sAantalDeuren);
            }
            else{
                //error bericht geven
                val.geefErrorBericht();

            }
        });

        //Totaal waarde van de auto's
        btnTotaalWaardeAuto.setOnAction(e->{
            int totaalWaarde = rc.waardeTotaalAuto();

            overzichtWaardeAuto.setText(String.valueOf(totaalWaarde));

        });


        //Scene opzetten
        primaryStage.setTitle("Registratie Auto");
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
