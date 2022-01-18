package fsk.si2;

public class Uputnice {
    public int brojUputnice;
    public Pacijent pacijent;
    public Doktor doktor;
    public String vrstaPregleda;
    public zdravstvenaUstanova zdravstvenaUstanova;
    public Klinika klinika;
    public String dijagnoza;

    public Uputnice(int brojUputnice, Pacijent pacijent, Doktor doktor, String vrstaPregleda, zdravstvenaUstanova zdravstvenaUstanova, Klinika klinika){
        this.brojUputnice=brojUputnice;
        this.pacijent=pacijent;
        this.doktor=doktor;
        this.vrstaPregleda=vrstaPregleda;
        this.zdravstvenaUstanova=zdravstvenaUstanova;
        this.klinika=klinika;
        this.dijagnoza=null;
    }
    public void setDijagnoza(String dijagnoza){
        this.dijagnoza=dijagnoza;
    }
    @Override
    public String toString(){
        return "Broj uputnice: "+this.brojUputnice+"\nPacijent: "+this.pacijent+"\nDoktor: "+this.doktor+"\nVrsta pregleda: "+this.vrstaPregleda+"\nZdravstvena ustanova: "+this.zdravstvenaUstanova+"\nKlinika: "+this.klinika+"\nDijagnoza: "+this.dijagnoza;
    }

}
