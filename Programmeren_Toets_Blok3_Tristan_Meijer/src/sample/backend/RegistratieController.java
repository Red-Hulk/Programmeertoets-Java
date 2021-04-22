package sample.backend;

import sample.interfaces.IVoertuig;

import java.util.ArrayList;
import java.util.List;

public class RegistratieController implements IVoertuig {

    protected ArrayList<Voertuig> lijst;

    public RegistratieController(){
        lijst = new ArrayList<>();
    }

    @Override
    public void opslaanAuto(String registratieKenteken, String bouwjaar, String merk, String type, int waarde, String kilometerstand, String motorInhoud, String brandstof, String aantalDeuren) {
        //Nieuwe instantie aanmaken Auto
        Auto deAuto = new Auto(registratieKenteken, bouwjaar, merk, type, waarde, kilometerstand, motorInhoud, brandstof,aantalDeuren);

        //Toevoegen aan lijst
        lijst.add(deAuto);
        System.out.println(lijst.size());

    }


    @Override
    public void opslaanBoot(String registratieKenteken, String bouwjaar, String merk, String type, int waarde, String kilometerstand, String omgevingGebruik, String motorInhoud) {
        //Nieuwe instantie aanmaken Boot
        Boot deBoot = new Boot(registratieKenteken, bouwjaar, merk, type, waarde, kilometerstand, omgevingGebruik, motorInhoud);

        //Toevoegen aan lijst
        lijst.add(deBoot);

    }


    @Override
    public void opslaanVliegtuig(String registratieKenteken, String bouwjaar, String merk, String type, int waarde, String kilometerstand, String vliegtuigMaatschappij, String afmeting, String aantalPassagiers) {
        //Nieuwe instantie aanmaken Vliegtuig
        Vliegtuig deVliegtuig = new Vliegtuig(registratieKenteken, bouwjaar, merk, type, waarde, kilometerstand, vliegtuigMaatschappij, afmeting, aantalPassagiers);

        //Toevoegen aan lijst
        lijst.add(deVliegtuig);

    }


    @Override
    public int overzichtAantalVoertuigen() {

        int aantal = lijst.size();

        return aantal;
    }


    @Override
    public int waardeTotaalAuto() {

        int waarde = 0;

        ArrayList<Auto> lijstAuto = new ArrayList<>();

        for (Voertuig v : lijst) {
            //Polymorfie
            if (v instanceof Auto) {
                lijstAuto.add((Auto) v);
            }
        }

        List<Integer> waardeAutoLijst = new ArrayList<Integer>();

        lijstAuto.forEach(e->{
            waardeAutoLijst.add(e.getWaarde());
        });

        for (int i : waardeAutoLijst){
            waarde += i;
        }

        return waarde;
    }


    @Override
    public int waardeTotaalVliegtuig() {

        //waarde eerst op 0 zetten
        int waarde = 0;

        //Lijst met alleen vliegtuigen
        ArrayList<Vliegtuig> lijstVliegtuig = new ArrayList<>();

        //uit de normale lijst de vleigtuigen halen
        for (Voertuig v : lijst) {
            //Polymorfie
            if (v instanceof Vliegtuig) {
                lijstVliegtuig.add((Vliegtuig) v);
            }
        }

        //Lijst met integers om op te tellen
        List<Integer> waardeVliegtuigLijst = new ArrayList<Integer>();

        lijstVliegtuig.forEach(e->{
            waardeVliegtuigLijst.add(e.getWaarde());
        });

        // Waarden lijst optellen
        for (int i : waardeVliegtuigLijst){
            waarde += i;
        }

        return waarde;
    }


    @Override
    public int waardeTotaalBoot() {

        int waarde = 0;

        ArrayList<Boot> lijstBoot = new ArrayList<>();

        for (Voertuig v : lijst) {
            //Polymorfie
            if (v instanceof Boot) {
                lijstBoot.add((Boot) v);
            }
        }

        List<Integer> waardeBootLijst = new ArrayList<Integer>();

        lijstBoot.forEach(e->{
            waardeBootLijst.add(e.getWaarde());
        });

        for (int i : waardeBootLijst){
            waarde += i;
        }

        return waarde;
    }
}
