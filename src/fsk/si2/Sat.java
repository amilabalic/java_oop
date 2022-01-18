package fsk.si2;

public class Sat {
    private int minuta;
    private int sat;

    public Sat(int sat,int minuta) {
        this.sat = ((sat >= 0 && sat <= 23) ? sat : -1);
        this.minuta = ((minuta >= 0 && minuta <= 60) ? minuta : -1);
    }
    @Override
    public String toString(){
        return this.sat+":"+this.minuta;
    }
}
