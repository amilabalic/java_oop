package fsk.si2;

public class Termin {
    public int idTermin;
    public Pacijent pacijent;
    public Doktor doktor;
    public Datum datum;
    public Sat sat;

    public Termin(int idTermin, Pacijent pacijent, Doktor doktor, Datum datum, Sat sat){
        this.idTermin=idTermin;
        this.pacijent=pacijent;
        this.doktor=doktor;
        this.datum=datum;
        this.sat=sat;
    }
    @Override
    public String toString(){
        return "ID termina: "+this.idTermin+"\nPacijent: "+this.pacijent+"\nDoktor: "+this.doktor+"\nDatum: "+this.datum+"\nSat: "+this.sat;
    }

}
