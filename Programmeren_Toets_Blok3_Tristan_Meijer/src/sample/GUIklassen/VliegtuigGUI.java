package sample.GUIklassen;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import sample.backend.RegistratieController;
import sample.interfaces.IGUI;

public class VliegtuigGUI extends SceneGUI implements IGUI {

    protected BorderPane root;
    protected GridPane container;
    protected Button btnTotaalWaardeVliegtuig;
    protected TextArea overzichtWaardeVliegtuig;
    protected Label lbVliegMaatschappij, lbAfmeting, lbAantalPassagiers, lbTitel;
    protected TextField txtVliegMaatschappij, txtAfmeting, txtAantalPassagiers;

    @Override
    public void maakGuiAan() {

        //Nieuw instanties aanmaken
        root = new BorderPane();
        container = new GridPane();
        btnTotaalWaardeVliegtuig = new Button("Totaal Waarde Vliegtuig");
        lbVliegMaatschappij = new Label("Vliegmaatschappij: ");
        lbAfmeting = new Label("Afmeting: ");
        lbAantalPassagiers = new Label("Aantal Passagiers: ");
        lbTitel = new Label("Registreren Auto");
        txtVliegMaatschappij = new TextField();
        txtAfmeting = new TextField();
        txtAantalPassagiers = new TextField();
        overzichtWaardeVliegtuig = new TextArea();

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

        /*------------------------------------------------------*/

        container.add(lbVliegMaatschappij,0,6);
        container.add(txtVliegMaatschappij,1,6);

        container.add(lbAfmeting,0,7);
        container.add(txtAfmeting,1,7);

        container.add(lbAantalPassagiers,0,8);
        container.add(txtAantalPassagiers,1,8);

        /*-------------------------------------------------------*/

        container.add(overzichtWaardeVliegtuig,0,10);

        container.add(btnTotaalWaardeVliegtuig,1,11);

        //Styling
        container.setAlignment(Pos.CENTER);
        lbTitel.setAlignment(Pos.CENTER);

    }
}
