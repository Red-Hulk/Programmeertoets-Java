package sample.screens;

import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.GUIklassen.BootGUI;
import sample.GUIklassen.SceneGUI;
import sample.backend.RegistratieController;
import sample.backend.Validatie;

public class BootScreen extends BootGUI {

    protected RegistratieController rc;

    public BootScreen(RegistratieController rc){

        this.rc = rc;

        //Validatie Object aanmaken
        Validatie val = new Validatie();
        Stage primaryStage = new Stage();

        //Gui aanmaken
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
            String sOmgevingGebruik = txtOmgevingGebruik.getText();
            String sMotorInhoud =  txtMotorInhoud.getText();

            //Velden leegmaken
            txtKenteken.clear();
            txtBouwjaar.clear();
            txtMerk.clear();
            txtType.clear();
            txtKilometerstand.clear();
            txtWaarde.clear();
            txtOmgevingGebruik.clear();
            txtMotorInhoud.clear();

            //Validatie uitvoeren op input gebruiker
            if(val.checkOpNummer(sWaarde) == true) {
                int iWaarde = Integer.parseInt(sWaarde);

                //Opslaan functie aanroepen
                rc.opslaanBoot(sKenteken, sBouwjaar, sMerk, sType, iWaarde, sKilometerstand, sOmgevingGebruik, sMotorInhoud );
            }
            else{
                //Error bericht sturen
                val.geefErrorBericht();

            }
        });

        //Totaalwaarde van de boten
        btnTotaalWaardeBoot.setOnAction(e->{
            int totaalWaarde = rc.waardeTotaalBoot();

            overzichtWaardeBoot.setText(String.valueOf(totaalWaarde));

        });


        //Scene opzetten
        primaryStage.setTitle("Registratie Boot");
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
