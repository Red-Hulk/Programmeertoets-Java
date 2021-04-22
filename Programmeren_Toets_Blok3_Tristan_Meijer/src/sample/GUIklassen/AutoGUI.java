package sample.GUIklassen;


import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import sample.backend.RegistratieController;
import sample.interfaces.IGUI;

public class AutoGUI extends SceneGUI implements IGUI {

    protected BorderPane root;
    protected GridPane container;

    protected Button btnTotaalWaardeAuto;
    protected TextArea overzichtWaardeAuto;
    protected Label lbMotorInhoud, lbAantalDeuren, lbBrandstof, lbTitel;
    protected TextField txtMoterInhoud, txtAantalDeuren, txtBrandstof;

    @Override
    public void maakGuiAan() {


        //Nieuw instanties aanmaken
        root = new BorderPane();
        container = new GridPane();
        btnTotaalWaardeAuto = new Button("Totaal Waarde Auto");
        lbMotorInhoud = new Label("Motorinhoud: ");
        lbAantalDeuren = new Label("Aantal Deuren: ");
        lbBrandstof = new Label("Brandstof: ");
        lbTitel = new Label("Registreren Auto");
        txtMoterInhoud = new TextField();
        txtAantalDeuren = new TextField();
        txtBrandstof = new TextField();
        overzichtWaardeAuto = new TextArea();

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


        container.add(btnRegistreren,1,9);

        /*--------------------------------------------------------*/

        container.add(lbMotorInhoud,0,6);
        container.add(txtMoterInhoud,1,6);

        container.add(lbAantalDeuren,0,7);
        container.add(txtAantalDeuren,1,7);

        container.add(lbBrandstof,0,8);
        container.add(txtBrandstof,1,8);

        /*-------------------------------------------------------------*/

        container.add(overzichtWaardeAuto,0,10);

        container.add(btnTotaalWaardeAuto,1,11);


        //Styling
        container.setAlignment(Pos.CENTER);
        lbTitel.setAlignment(Pos.CENTER);



    }
}
