package sample.GUIklassen;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.backend.RegistratieController;

public class SceneGUI {

    protected Label lbKenteken, lbBouwjaar, lbMerk, lbType, lbKilometerstand, lbWaarde;
    protected TextField txtKenteken, txtBouwjaar, txtMerk, txtType, txtKilometerstand, txtWaarde;
    protected Button btnRegistreren;

    public SceneGUI(){


        //nieuwe instanties
        lbKenteken = new Label("Kentekennr/Registratienr: ");
        lbBouwjaar = new Label("Bouwjaar: ");
        lbMerk = new Label("Merk: ");
        lbType = new Label("Type: ");
        lbKilometerstand = new Label("Kilometerstand: ");
        lbWaarde = new Label("Waarde: ");

        txtKenteken = new TextField();
        txtBouwjaar = new TextField();
        txtMerk = new TextField();
        txtType = new TextField();
        txtKilometerstand = new TextField();
        txtWaarde = new TextField();

        btnRegistreren = new Button("Opslaan!");

    }
}
