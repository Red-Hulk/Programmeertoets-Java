package sample.GUIklassen;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import sample.backend.RegistratieController;
import sample.interfaces.IGUI;

public class BootGUI extends SceneGUI implements IGUI {

    protected BorderPane root;
    protected GridPane container;
    protected Button btnTotaalWaardeBoot;
    protected TextArea overzichtWaardeBoot;
    protected Label lbOmgevingGebruik, lbMotorInhoud, lbTitel;
    protected TextField txtOmgevingGebruik, txtMotorInhoud;

    @Override
    public void maakGuiAan() {

        //Nieuw instanties aanmaken
        root = new BorderPane();
        container = new GridPane();
        btnTotaalWaardeBoot = new Button("Totaal Waarde Boot");
        lbMotorInhoud = new Label("Motorinhoud: ");
        lbOmgevingGebruik = new Label("Omgeving van gebruik: ");
        lbTitel = new Label("Registreren BOot");
        txtOmgevingGebruik = new TextField();
        txtMotorInhoud = new TextField();
        overzichtWaardeBoot = new TextArea();

        //Elementen neerzetten in containers
        root.setCenter(container);
        root.setTop(lbTitel);

        /*------------------------------------------------------*/

        container.add(lbKenteken,0,0);
        container.add(txtKenteken,1,0);

        container.add(lbBouwjaar,0,1);
        container.add(txtBouwjaar,1,1);

        container.add(lbMerk,0,2);
        container.add(txtMerk,1,2);

        container.add(lbType,0,3);
        container.add(txtType,1,3);

        container.add(lbKilometerstand,0,4);
        container.add(txtKilometerstand,1,4);

        container.add(lbWaarde,0,5);
        container.add(txtWaarde,1,5);


        container.add(btnRegistreren,1,8);

        /*-------------------------------------------------------*/

        container.add(lbOmgevingGebruik,0,6);
        container.add(txtOmgevingGebruik,1,6);

        container.add(lbMotorInhoud,0,7);
        container.add(txtMotorInhoud,1,7);

        /*----------------------------------------------------------*/

        container.add(overzichtWaardeBoot,0,9);

        container.add(btnTotaalWaardeBoot,1,10);


        //Styling
        container.setAlignment(Pos.CENTER);
        lbTitel.setAlignment(Pos.CENTER);

    }
}
