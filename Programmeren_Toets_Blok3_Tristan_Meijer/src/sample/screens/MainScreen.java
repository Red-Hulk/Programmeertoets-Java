package sample.screens;

import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.GUIklassen.MainGUI;
import sample.backend.RegistratieController;

public class MainScreen extends MainGUI {

    public MainScreen(Stage primaryStage){

        RegistratieController rc = new RegistratieController();

        maakGuiAan();

        //Set On Action Events

        btnKiezen.setOnAction(e->{
            if(btnAuto.isSelected() == true){
                new AutoScreen(rc);
            }
            else if(btnBoot.isSelected() == true){
                new BootScreen(rc);
            }
            else if(btnVliegtuig.isSelected() == true){
                new VliegtuigScreen(rc);
            }
        });

        btnTotaalOverzichtVoertuigen.setOnAction(e->{
            int aantal = rc.overzichtAantalVoertuigen();

            totaalOverzichtVoertuigen.setText(String.valueOf(aantal));

        });



        primaryStage.setTitle("Museum Objecten Registratie");
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
