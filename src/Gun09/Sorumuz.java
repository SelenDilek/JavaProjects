package Gun09;

import java.util.Scanner;

public class Sorumuz {
    public static void main(String[] args) {
        //not hesabi
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ifadeyi giriniz = ");
        String ifade= scanner.nextLine();

        ifade=ifade.replaceAll("[a-zA-Z]" , "");

        if(ifade.isEmpty()){

            System.out.print("Lutfen string ifadenizi giriniz!");

        }

        if (!ifade.isEmpty()) {

            int yeniIfade = Integer.parseInt(ifade);

            if( (yeniIfade<0 || yeniIfade >100 ))
            {
                System.out.println("Lutfen notunuzu giriniz yanlis girdiniz hatali not girisi!");
            }

            if(! (yeniIfade<0 || yeniIfade >100 )) {

                if (yeniIfade >= 50) {

                    System.out.println("GECTINIZ!");
                }

                if (yeniIfade < 50) {

                    System.out.println("KALDINIZ!");
                }

            }
        }



    }
}
