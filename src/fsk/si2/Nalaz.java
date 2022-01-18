package fsk.si2;

public class Nalaz {
    public int brojProtokola;
    public Anamneza anamneza;
    public Doktor doktor;
    public String misljenje;
    public Datum datumIzdavanja;
    public String terapija;
    public String dijagnoza;

    public Nalaz(int brojProtokola,Anamneza anamneza, Doktor doktor,Datum datumIzdavanja,String dijagnoza){
        this.brojProtokola=brojProtokola;
        this.anamneza=anamneza;
        this.doktor=doktor;
        this.datumIzdavanja=datumIzdavanja;
        this.dijagnoza=dijagnoza;
        this.misljenje=null;
        this.terapija=null;
    }
    public void setMisljenje(String misljenje){
        this.misljenje=misljenje;
    }
    public void setTerapija(String terapija){
        this.terapija=terapija;
    }
    @Override
    public String toString(){
        return "Broj protokola: "+this.brojProtokola+"\nID Anamneze: "+this.anamneza+"\nBroj licence: "+this.doktor+"\nDatum izdavanja:"+this.datumIzdavanja+"\nDijagnoza:"+this.dijagnoza+"\nMisljenje"+this.misljenje+"\nTerapija"+this.terapija;
    }
}
