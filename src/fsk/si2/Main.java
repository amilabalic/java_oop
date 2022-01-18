//Grupa: Amila Balić, Amina Muftić, Samra Duran, Semina Milanović
//Tema: E-karton

package fsk.si2;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        zdravstvenaUstanova zu1=new zdravstvenaUstanova(1,"JU Dom zdravlja KS","Sarajevo","ul. Doma zdravlja 58");
        zdravstvenaUstanova zu2=new zdravstvenaUstanova(2,"Opća bolnica","Sarajevo","Bolnička 1");
        Klinika klinika1=new Klinika(123,zu2,"Klinika za ORL");
        Klinika klinika2=new Klinika(456,zu1,"Pedijatrija");
        klinika2.setTelefon("036-712-852");

        Doktor doktor1=new Doktor(321,"Mustafa","Mustafić","pedijatar",zu1,klinika2);
        Doktor doktor2=new Doktor(654,"Ana","Anić","ORL",zu2,klinika1);
        ArrayList<Doktor>doktori=new ArrayList<>();
        doktori.add(doktor1);
        doktori.add(doktor2);
        System.out.println(doktori);
        System.out.println("\n--------------------");

        Datum datumPocetka=new Datum(14,3,2003);
        Datum datumOvjere=new Datum(31,12,2022);
        Osiguranje osig=new Osiguranje(123456,"Radni odnos",datumPocetka,datumOvjere,"aktivna");
        osig.setIzabraniDoktor(doktor2);
        Anamneza anamneza=new Anamneza(14,"O+","Sinopharm");
        Datum datumIzdavanja=new Datum(30,11,2021);
        Nalaz nalaz=new Nalaz(10,anamneza,doktor1,datumIzdavanja,"EO5");

        Datum datumRodjenja=new Datum(13,4,1975);
        Pacijent pacijent1=new Pacijent(1304000,"Niko","Nikić",datumRodjenja,"M","Sarajevo",osig);
        pacijent1.setanamneza(anamneza);

        Recept r1=new Recept(56,pacijent1,doktor2,"Paracetamol","E05");

        Uputnice u1=new Uputnice(1,pacijent1,doktor2,"Kontrola",zu1,klinika2);
        //System.out.println(u1);
        Datum datumKontrole=new Datum(25,6,2022);
        Sat satKontrole=new Sat(14,30);
        Termin t1=new Termin(1,pacijent1,doktor1,datumKontrole,satKontrole);
        //System.out.println(t1);


    }
}
