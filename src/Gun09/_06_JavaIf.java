package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız
        Scanner oku = new Scanner(System.in);
        System.out.print("Cumle giriniz = ");
        String cumle = oku.nextLine();

        boolean aVarmi = cumle.contains("a"); //a var ise true yok ise false

        if(aVarmi==true){

            System.out.println("EVET");
        }


        if(aVarmi==false) {

            System.out.println("HAYIR");
        }

        //2.yol

        if(cumle.contains("a")){

            System.out.println("EVET");
        }


        if(cumle.contains("a")) {

            System.out.println("HAYIR");
        }

            //3.yol

        if(cumle.contains("a")){

            System.out.println("EVET");
        }


        if(! cumle.contains("a")) {

            System.out.println("HAYIR");
        }

        //Alternatif

        cumle.contains("a"); //a iceriyor mu
        cumle.indexOf("a"); //a iceriyor ise indexini verir. (0-...)
                            //a icermiyor ise -1 verir.

        if(cumle.indexOf("a") >=0) { //!= -1

            System.out.println("EVET");
        }

        if(cumle.indexOf("a") ==-1) { //-1 YOK DEMEK. <0

            System.out.println("HAYIR ");
        }








    }
}
