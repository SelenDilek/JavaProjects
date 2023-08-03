package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        //NOT : CTRL + ALT + L
        int sayi = 5; //hafizada int kadar yer kaplar,sadece tam sayi atilabilir.Tam sayilarda default int
        byte byteDeger = 7; // -128 +128
        short shortDeger = 1645; //-32000 - +32000
        int intDeger = 2500000;
        long longDeger = 3535662211111111l; //long degeri yazarken sonuna "l" harfi yazilir.


        //ondalikli sayilar
        //ondalikli sayilarin default u double dir.(default: bir yerde gorurse ondalikli double olarak algilar)
        double doubleDeger = 3.141516121111; //noktadan sonra 16 haneye kadar saklar hassasiyeti var
        float floatDeger = 3.1234556f; //sonuna f konulur.noktadan 5 hane hassasiyeti var

        //karakter ve harfler
        char basHarf = 'M';
        String isim = "Selen"; //kelime veya cumle saklayabilir uzunlugu degisken

        System.out.println("isim = " + isim);
        System.out.println("basHarf = " + basHarf);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("byteDeger = " + byteDeger);
        System.out.println("sayi = " + sayi);
        System.out.println("doubleDeger = " + doubleDeger);


    }
}
