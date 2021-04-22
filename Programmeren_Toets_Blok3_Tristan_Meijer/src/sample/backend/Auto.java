package sample.backend;

public class Auto extends Voertuig{

    private String motorInhoud, brandstof, aantalDeuren;

    public Auto(String registratieKenteken, String bouwjaar, String merk, String type, int waarde, String kilometerstand, String motorInhoud, String brandstof, String aantalDeuren) {
        super(registratieKenteken, bouwjaar, merk, type, waarde, kilometerstand);
        this.motorInhoud = motorInhoud;
        this.brandstof = brandstof;
        this.aantalDeuren = aantalDeuren;
    }

    public String getMotorInhoud() {
        return motorInhoud;
    }

    public void setMotorInhoud(String motorInhoud) {
        this.motorInhoud = motorInhoud;
    }

    public String getBrandstof() {
        return brandstof;
    }

    public void setBrandstof(String brandstof) {
        this.brandstof = brandstof;
    }

    public String getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(String aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }
}
