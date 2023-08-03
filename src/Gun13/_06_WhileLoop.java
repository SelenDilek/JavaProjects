package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {

        // Girilen 6 sayıdan sadece pozitif olanlarının
        // toplamını bulunuz

        Scanner scan = new Scanner(System.in);
        int sayac = 1;
        int toplam = 0;


        while (sayac <= 6) {
            System.out.print(sayac + ".sayi giriniz=");
            int sayi = scan.nextInt(); // 6 defa sayi isteyecek!

            if(sayi>=0)
                toplam = toplam + sayi; //if e ait bir islem.



            sayac=sayac+1; //while dongusune ait bir islem.
        }


        System.out.println("toplam = " + toplam);


    }




    }

