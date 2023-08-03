package Gun28._03_Ornek;

public class Kitapci {
    public static void main(String[] args) {

        Kitap kitap= new Kitap();
        kitap.author="J.J.R";
        kitap.name="Sefiller";
        kitap.publishYear=1890;
        System.out.println(kitap.toString());

        System.out.println();

        Kitap deneme = new Kitap();
        deneme.author="Ayse Kln";
        System.out.println(deneme.author);

        Kitap kitapp=new Kitap("Nazim Hikmek" , 1876);
        System.out.println(kitap.toString());



    }
}
