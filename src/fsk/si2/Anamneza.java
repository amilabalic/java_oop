package fsk.si2;

public class Anamneza {
    public int idAnamneza;
    public String alergije;
    public String krvnaGrupa;
    public String donorKrvi;
    public String donorOrgana;
    public String invalidnost;
    public String kontinualnaTerapija;
    public String hronicnaOboljenja;
    public String zavisnost;
    public String vakcine;

    public Anamneza( int idAnamnezanamneza, String krvnaGrupa,String vakcine){
        this.idAnamneza=idAnamneza;
        this.krvnaGrupa=krvnaGrupa;
        this.vakcine=vakcine;
        this.hronicnaOboljenja=null;
        this.zavisnost=null;
        this.invalidnost=null;
        this.alergije=null;
        this.kontinualnaTerapija=null;
        this.donorOrgana=null;
        this.donorKrvi=null;

    }
    public void setAlergije(String alergije){
        this.alergije=alergije;
    }
    public void setDonorKrvi(String donorKrvi){
        this.donorKrvi=donorKrvi;
    }
    public void setKontinualnaTerapija(String kontinualnaTerapija){
        this.kontinualnaTerapija=kontinualnaTerapija;
    }
    public void setDonorOrgana(String donorOrgana){
        this.donorOrgana=donorOrgana;
    }
    public void setInvalidnost(String invalidnost){
        this.invalidnost=invalidnost;
    }
    public void setHronicnaOboljenja(String hronicnaOboljenja){
        this.hronicnaOboljenja=hronicnaOboljenja;
    }
    public void setZavisnost(String zavisnost){
        this.zavisnost=zavisnost;
    }

    @Override
    public String toString(){
        return "ID Anamneze "+this.idAnamneza+"\nKrvna grupa"+this.krvnaGrupa+"\nVakcine: "+this.vakcine+"\nHronicna oboljenja:"+this.hronicnaOboljenja+"\nZavisnost:"+this.zavisnost+"\nInvalidnost:"+this.invalidnost+"\nAlergije:"+this.alergije+"\nKontinualna terapija:"+this.kontinualnaTerapija+"\nDonor krvi:"+this.donorKrvi+"\nDonor organa:"+this.donorOrgana;
    }
}
