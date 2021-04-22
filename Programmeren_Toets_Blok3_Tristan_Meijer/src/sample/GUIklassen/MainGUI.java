package sample.GUIklassen;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import sample.backend.RegistratieController;
import sample.interfaces.IGUI;

public class MainGUI extends SceneGUI implements IGUI {

    //Containers
    protected BorderPane root, titelContainer;
    protected Pane centerPane;

    //Bouwstenen van scene
    protected RadioButton btnAuto, btnVliegtuig, btnBoot;
    protected ToggleGroup gp;
    protected Label titelHoofdscherm;
    protected Button btnKiezen, btnTotaalOverzichtVoertuigen;
    protected TextArea totaalOverzichtVoertuigen;
    protected RegistratieController rc;


    @Override
    public void maakGuiAan() {

        //Nieuwe instanties maken
        root = new BorderPane();
        titelContainer = new BorderPane();
        centerPane = new Pane();
        btnAuto = new RadioButton("Auto");
        btnVliegtuig = new RadioButton("Vliegtuig");
        btnBoot = new RadioButton("Boot");
        gp = new ToggleGroup();
        titelHoofdscherm = new Label("Museum Voertuigobjecten Registratie Applicatie");
        btnKiezen = new Button("Bevestig Keuze");
        btnTotaalOverzichtVoertuigen = new Button("Overzicht Aantal Voertuigen");
        totaalOverzichtVoertuigen = new TextArea();

        /*--------------------------------------------------------------------------------------*/

        //Elementen neerzetten in container en togglegroup neerzetten
        //Hoofdcontainer invullen
        root.setCenter(centerPane);
        root.setTop(titelContainer);

        //titlepane vullen met titel
        titelContainer.setCenter(titelHoofdscherm);

        //Pane vullen met togglebuttons & buttons & textarea
        centerPane.getChildren().addAll(btnAuto, btnVliegtuig, btnBoot, btnKiezen, btnTotaalOverzichtVoertuigen, totaalOverzichtVoertuigen);

        //Elementen specifiek neerzetten in Pane
        btnAuto.setLayoutY(300);
        btnAuto.setLayoutX(300);

        btnVliegtuig.setLayoutY(320);
        btnVliegtuig.setLayoutX(300);

        btnBoot.setLayoutY(340);
        btnBoot.setLayoutX(300);

        btnKiezen.setLayoutY(360);
        btnKiezen.setLayoutX(300);

        totaalOverzichtVoertuigen.setLayoutY(400);
        totaalOverzichtVoertuigen.setLayoutX(300);

        btnTotaalOverzichtVoertuigen.setLayoutY(600);
        btnTotaalOverzichtVoertuigen.setLayoutX(300);

        //Togglegroep
        btnAuto.setToggleGroup(gp);
        btnVliegtuig.setToggleGroup(gp);
        btnBoot.setToggleGroup(gp);

        /*--------------------------------------------------------------------------------------*/

        //Styling elementen
        titelHoofdscherm.setAlignment(Pos.CENTER);
        totaalOverzichtVoertuigen.setMaxSize(200,200);


    }
}
