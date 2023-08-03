package Gun03;

public class _07_Ornek3 {
    public static void main(String[] args) {
        //kisinin kilonuz ve boyunu kendiniz veriniz.
        //ekrana kilonuz : .... ve boyunuz= ... yazdiktiktan sonra
        //vucutkitle indeksi bulunuz : kg/ (boy*boy)
        double kilo = 55.3 ; //kg
        double boy = 1.62 ; // metre

        System.out.println("boy = " + boy);
        System.out.println("kilo = " + kilo);

        double vucutIndex = kilo / (boy * boy) ;

        System.out.println("vucutIndex = " + vucutIndex);



    }
}
