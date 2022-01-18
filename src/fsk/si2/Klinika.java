package fsk.si2;

public class Klinika {
    public int idKlinike;
    public zdravstvenaUstanova zdravstvenaUstanova;
    public String naziv;
    public String telefon;

    public Klinika(int idKlinike,zdravstvenaUstanova zdravstvenaUstanova, String naziv){
        this.idKlinike=idKlinike;
        this.zdravstvenaUstanova= zdravstvenaUstanova;
        this.naziv=naziv;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString(){
        return "ID klinike: "+this.idKlinike+"\nZdravstvena ustanova: "+this.zdravstvenaUstanova+"\nNaziv: "+this.naziv+"\nTelefon:"+this.telefon;
    }
}
