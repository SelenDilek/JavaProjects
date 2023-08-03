package Gun13;

import java.util.Scanner;

public class _03_Switch {
    public static void main(String[] args) {

// Girilen bir Ay numarasına göre ayın kaç gün sürdüğünü yazdırınız.
        Scanner scan = new Scanner(System.in);
        System.out.print("Ay numarasi giriniz=");
        int ayNo = scan.nextInt();

        switch (ayNo) {

            case 1:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println("HATALI GIRIS YAPTINIZ");


        }
        //2.Yontem break olmadigi icin asagiya iniyor en alti goruyor. Gruplandirma yapmak icin break olmadan :
        switch (ayNo) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                System.out.println(31);
                break;

            case 2:
                System.out.println(28);
                break;


            case 4:
            case 6:
            case 9:
            case 10:
            case 11: System.out.println(30);break;
            default: System.out.println("Hatali giris  yaptiniz!");


        }


    }
}
