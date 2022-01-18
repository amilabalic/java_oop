package fsk.si2;

public class Pacijent {
    public int JMBG;
    public String ime;
    public String prezime;
    public String imeRoditelja;
    public Datum datumRođenja;
    public String pol;
    public String mjestoRođenja;
    public String Adresa;
    public String email;
    public String telefon;
    public String hitniKontakt;
    public Osiguranje osiguranje;
    public Anamneza anamneza;

    public Pacijent(int JMBG, String ime,String prezime,Datum datumRođenja,String pol,String mjestoRođenja,Osiguranje osiguranje){
        this.JMBG=JMBG;
        this.ime=ime;
        this.prezime=prezime;
        this.datumRođenja=datumRođenja;
        this.pol=pol;
        this.mjestoRođenja=mjestoRođenja;
        this.osiguranje=osiguranje;
        this.imeRoditelja=null;
        this.email=null;
        this.telefon=null;
        this.hitniKontakt=null;

    }
    public Pacijent(String ime){
        this.JMBG=0;
        this.ime=ime;
        this.prezime=null;
        this.datumRođenja=null;
        this.pol=null;
        this.mjestoRođenja=null;
        this.osiguranje=null;
        this.imeRoditelja=null;
        this.email=null;
        this.telefon=null;
        this.hitniKontakt=null;

    }

    public String getIme() {
        return ime;
    }

    public void setImeRoditelja(String imeRoditelja){
        this.imeRoditelja=imeRoditelja;
    }
    public void setTelefon(String telefon){
        this.telefon=telefon;
    }
    public void setHitniKontakt(String hitniKontakti){
        this.hitniKontakt=hitniKontakti;
    }
    public void setanamneza(Anamneza anamneza){
        this.anamneza=anamneza;
    }
    @Override
    public String toString(){
        return "JMBG: "+this.JMBG+"\nIme: "+this.ime+"\nPrezime: "+this.prezime+"\nDatum rodjenja:"+this.datumRođenja+"\nPol: "+this.pol+"\nMjesto rodjenja: "+this.mjestoRođenja+"\nBroj kartice: "+this.osiguranje+"\nIme roditelja: "+this.imeRoditelja+"\nTelefon: "+this.telefon+"\nHitni kontakt: "+this.hitniKontakt+"\nID anamneze: "+this.anamneza;
    }
}
