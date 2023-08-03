package Gun19;

public class _05_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz(); //biz cagirirsak yazar  //Math.Random()
        merhabaYaz();

        merhabaYazIsme("Selen"); //Math.Abs(-10)

        cokMerhabaYaz(5);



    }

    public static void merhabaYaz(){

        System.out.println("Merhaba Dunya"); //burda yazmaz.
    }


    public static void  merhabaYazIsme(String ad){

        System.out.println("Merhaba" +" " + ad);
    }


    public static void  cokMerhabaYaz(int miktar){

        for (int i = 0; i <miktar ; i++) {
            System.out.println("Merhaba");

        }
    }


}
