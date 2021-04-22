package sample.backend;

public class Voertuig {

    private String registratieKenteken, bouwjaar, merk, type, kilometerstand;
    private int waarde;

    public Voertuig(String registratieKenteken, String bouwjaar, String merk, String type, int waarde, String kilometerstand) {
        this.registratieKenteken = registratieKenteken;
        this.bouwjaar = bouwjaar;
        this.merk = merk;
        this.type = type;
        this.waarde = waarde;
        this.kilometerstand = kilometerstand;
    }

    public String getRegistratieKenteken() {
        return registratieKenteken;
    }

    public void setRegistratieKenteken(String registratieKenteken) {
        this.registratieKenteken = registratieKenteken;
    }

    public String getBouwjaar() {
        return bouwjaar;
    }

    public void setBouwjaar(String bouwjaar) {
        this.bouwjaar = bouwjaar;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    public String getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(String kilometerstand) {
        this.kilometerstand = kilometerstand;
    }
}
