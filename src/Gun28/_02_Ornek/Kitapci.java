package Gun28._02_Ornek;

public class Kitapci {
    public static void main(String[] args) {
        //Constructer birden fazla secenek yaratmamizi saglar.

        Kitap kitap1 = new Kitap();
        kitap1.name = "Harry Poter";
        kitap1.publishYear=1997;
        kitap1.author="JK ROWLING";

        System.out.println("kitap1.toString() = " + kitap1.toString());

        
        Kitap kitap2 = new Kitap("Yuzukler" , 1954 , "JRR TOLKIEN");
        System.out.println("kitap1 = " + kitap2);

        Kitap kitap3 = new Kitap("Kuyucakli Yusuf" , "Sabahattin Ali");
        System.out.println("kitap2 = " + kitap3);

        Kitap kitap4 = new Kitap("Kuyucakli Yusuf" , 1998 );
        System.out.println("kitap3 = " + kitap4);
        
        
    }
}
