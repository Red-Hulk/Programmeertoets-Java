package sample.interfaces;

import sample.backend.Auto;
import sample.backend.Boot;
import sample.backend.Vliegtuig;

import java.util.ArrayList;

public interface IVoertuig {

    public void opslaanAuto(String registratieKenteken, String bouwjaar, String merk, String type, int waarde, String kilometerstand, String motorInhoud, String brandstof, String aantalDeuren);
    public void opslaanBoot(String registratieKenteken, String bouwjaar, String merk, String type, int waarde, String kilometerstand, String omgevingGebruik, String motorInhoud);
    public void opslaanVliegtuig(String registratieKenteken, String bouwjaar, String merk, String type, int waarde, String kilometerstand, String vliegtuigMaatschappij, String afmeting, String aantalPassagiers);

    public int overzichtAantalVoertuigen();

    public int waardeTotaalAuto();
    public int waardeTotaalVliegtuig();
    public int waardeTotaalBoot();

}
