package sample.backend;

public class Vliegtuig extends Voertuig{

    private String vliegtuigMaatschappij, Afmeting, aantalPassagiers;

    public Vliegtuig(String registratieKenteken, String bouwjaar, String merk, String type, int waarde, String kilometerstand, String vliegtuigMaatschappij, String afmeting, String aantalPassagiers) {
        super(registratieKenteken, bouwjaar, merk, type, waarde, kilometerstand);
        this.vliegtuigMaatschappij = vliegtuigMaatschappij;
        Afmeting = afmeting;
        this.aantalPassagiers = aantalPassagiers;
    }

    public String getVliegtuigMaatschappij() {
        return vliegtuigMaatschappij;
    }

    public void setVliegtuigMaatschappij(String vliegtuigMaatschappij) {
        this.vliegtuigMaatschappij = vliegtuigMaatschappij;
    }

    public String getAfmeting() {
        return Afmeting;
    }

    public void setAfmeting(String afmeting) {
        Afmeting = afmeting;
    }

    public String getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(String aantalPassagiers) {
        this.aantalPassagiers = aantalPassagiers;
    }
}
