package fsk.si2;

public class zdravstvenaUstanova {
    public int idZdravstvenaUstanova;
    public String naziv;
    public String grad;
    public String adresa;
    public int telefon;

    public zdravstvenaUstanova(int idZdravstvenaUstanova, String naziv,String grad,String adresa){
        this.idZdravstvenaUstanova=idZdravstvenaUstanova;
        this.naziv=naziv;
        this.grad=grad;
        this.adresa=adresa;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString(){
        return "ID zdravstvene ustanove: "+this.idZdravstvenaUstanova+"\nNaziv zdravstvene ustanove: "+this.naziv+"\nGrad: "+this.grad+"\nAdresa:"+this.adresa+"\nTelefon:"+this.telefon;
    }
}
