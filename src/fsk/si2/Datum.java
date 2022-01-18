package fsk.si2;

public class Datum {
    public int dan;
    public int mjesec;
    public int godina;

    public Datum(int dan, int mjesec, int godina) {
        int[] dani = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0)
            dani[1]++;
        this.dan = ((dan > 0 && dan <= dani[mjesec - 1]) ? dan : 0);
        this.mjesec = ((mjesec > 0 && mjesec < 13) ? mjesec : 0);
        this.godina = ((godina > 0 && godina <= 2021) ? godina : 0);
    }
    @Override
    public String toString(){
        return this.dan+"."+this.mjesec+"."+this.godina;
    }
}

