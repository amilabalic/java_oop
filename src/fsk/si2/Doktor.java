package fsk.si2;

public class Doktor {
    public int brojLicence;
    public String ime;
    public String prezime;
    public String specijalizacija;
    public zdravstvenaUstanova zdravstvenaUstanova;
    public Klinika klinika;

    public Doktor(int brojLicence, String ime, String prezime, String specijalizacija,zdravstvenaUstanova zdravstvenaUstanova, Klinika klinika){
        this.brojLicence=brojLicence;
        this.ime=ime;
        this.prezime=prezime;
        this.specijalizacija=specijalizacija;
        this.zdravstvenaUstanova=zdravstvenaUstanova;
        this.klinika=null;
    }

    public String getSpecijalizacija() {
        return specijalizacija;
    }

    @Override
    public String toString(){
        return "Broj licence: "+this.brojLicence+"\nIme: "+this.ime+"\nPrezime: "+this.prezime+"\nSpecijalizacija: "+this.specijalizacija+"\nZdravstvena ustanova: "+this.zdravstvenaUstanova+"\nKlinika: "+this.klinika;
    }
}
