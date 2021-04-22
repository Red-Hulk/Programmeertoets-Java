package sample.backend;

public class Boot extends Voertuig{

    private String omgevingGebruik, motorInhoud;

    public Boot(String registratieKenteken, String bouwjaar, String merk, String type, int waarde, String kilometerstand, String omgevingGebruik, String motorInhoud) {
        super(registratieKenteken, bouwjaar, merk, type, waarde, kilometerstand);
        this.omgevingGebruik = omgevingGebruik;
        this.motorInhoud = motorInhoud;
    }

    public String getOmgevingGebruik() {
        return omgevingGebruik;
    }

    public void setOmgevingGebruik(String omgevingGebruik) {
        this.omgevingGebruik = omgevingGebruik;
    }

    public String getMotorInhoud() {
        return motorInhoud;
    }

    public void setMotorInhoud(String motorInhoud) {
        this.motorInhoud = motorInhoud;
    }
}
