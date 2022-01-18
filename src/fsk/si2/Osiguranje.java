package fsk.si2;

public class Osiguranje {
    public int brojKarice;
    public Doktor izabraniDoktor;
    public String osnovOsiguranja;
    public Datum pocetakOsiguranja;
    public Datum ovjeraIskaznice;
    public String statusPremije;
    public String nazivPoslodavca;

    public Osiguranje(int brojKarice, String osnovOsiguranja, Datum pocetakOsiguranja, Datum ovjeraIskaznice, String statusPremije){
        this.brojKarice=brojKarice;
        this.osnovOsiguranja=osnovOsiguranja;
        this.pocetakOsiguranja=pocetakOsiguranja;
        this.ovjeraIskaznice=ovjeraIskaznice;
        this.statusPremije=statusPremije;
        this.izabraniDoktor=null;
        this.nazivPoslodavca=null;
    }

    public void setIzabraniDoktor(Doktor izabraniDoktor) {
        this.izabraniDoktor = izabraniDoktor;
    }

    public void setNazivPoslodavca(String nazivPoslodavca) {
        this.nazivPoslodavca = nazivPoslodavca;
    }

    @Override
    public String toString(){
        return "Broj kartice: "+this.brojKarice+"\nOsnov osiguranja: "+this.osnovOsiguranja+"\nPocetak osiguranja: "+this.pocetakOsiguranja+"\nOvjera iskaznice:"+this.ovjeraIskaznice+"\nStatus premije:";
    }
}
