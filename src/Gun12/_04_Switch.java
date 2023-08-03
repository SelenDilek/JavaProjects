package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Gun no=");
        int gunNo = oku.nextInt();

        //switch : anahtarlama , if in anahtarli hali
        switch (gunNo){
            case 1 : System.out.println("Pazartesi"); break; //switch den cik demek
            case 2 : System.out.println("Sali"); break;
            case 3 : System.out.println("Carsamba"); break;
            case 4 : System.out.println("Persembe"); break;
            case 5 : System.out.println("Cuma"); break;
            case 6 : System.out.println("Cumartesi"); break;
            case 7 : System.out.println("Pazar"); break;
            default: System.out.println("Hatali giris");

        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Gün giriniz: ");
        String gun = scanner.nextLine();
        gun= gun.toLowerCase();
        gun=gun.replace("I" , "i");

        switch (gun) {
            case "pazartesi":
                System.out.println("1");
                break;
            case "salı":
                System.out.println("2");
                break;
            case "çarşamba":
                System.out.println("3");
                break;
            case "perşembe":
                System.out.println("4");
                break;
            case "cuma":
                System.out.println("5");
                break;
            case "cumartesi":
                System.out.println("6");
                break;
            case "pazar":
                System.out.println("7");
                break;
            default:
                System.out.println("Hatalı giriş");
                break;
        }








    }
}
