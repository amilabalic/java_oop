package fsk.si2;

public class Recept {
    public int idRecept;
    public Pacijent pacijent;
    public Doktor doktor;
    public String lijek;
    public String dijagnoza;

    public Recept(int idRecept, Pacijent pacijent, Doktor doktor,String lijek,String dijagnoza){
        this.idRecept=idRecept;
        this.pacijent=pacijent;
        this.doktor=doktor;
        this.lijek=lijek;
        this.dijagnoza=dijagnoza;
    }
    @Override
    public String toString(){
        return "ID recepta: "+this.idRecept+"\nPacijent: "+this.pacijent+"\nDoktor: "+this.doktor+"\nLijek:"+this.lijek+"\nDijagnoza:"+this.dijagnoza;
    }
}
