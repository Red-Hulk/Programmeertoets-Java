package sample.backend;

import javafx.scene.control.Alert;

public class Validatie {

    //Input checken of het een nummer is
    public boolean checkOpNummer(String waarde){
        boolean bResult = false;
        try{
            Integer.parseInt(waarde);
            bResult = true;
        }
        //Nummerexceptie
        catch(NumberFormatException nex){
            bResult = false;
        }
        //Algemene exceptie
        catch(Exception ex){
            bResult = false;
        }
        finally {

            return bResult;
        }
    }

    //Error bericht geven
    public void geefErrorBericht(){

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Textveld Waarde niet goed ingevuld!");
        alert.show();

    }
}
