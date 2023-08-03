package Gun31._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {

        ArrayList<Pizza> siparisler = new ArrayList<>();
        Scanner okuInt = new Scanner(System.in);
        int secim = 0;

        do {
            menu(); //menuyu goster
            secim = okuInt.nextInt();         //secim yapsin

            switch (secim) {

                case 1:
                    Pizza p = new Pizza(PizzaSize.SMALL);
                    siparisler.add(p);
                    break;
                case 2:
                    p = new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(p);
                    break;
                case 3:
                    p = new Pizza(PizzaSize.LARGE);
                    siparisler.add(p);
                    break;
                case 4:
                    siparisYazdir(siparisler);
                    break;

            }

        } while (secim < 5);

        }

    public static void menu() {

        System.out.println("*********PIZZA MENU*************");
        System.out.println("1-SMALL");
        System.out.println("2-MEDIUM");
        System.out.println("3-LARGE");
        System.out.println("4-ISLEM YAPILIYOR");
        System.out.println("5-CIKIS");
        System.out.print("Lutfen secim yapiniz=");


    }
    public static void siparisYazdir(ArrayList<Pizza> siparisler){
        int s=0 , m=0 , l =0 ;

        for(Pizza p : siparisler){

            switch (p.pizzaSize){

                case SMALL : s++ ; break;
                case LARGE: l++ ; break;
                case MEDIUM: m++ ; break;
            }

        }
        System.out.println("SMALL MIKTAR :" + s);
        System.out.println("MEDIUM MIKTAR :" + m);
        System.out.println("LARGE MIKTAR :" + l);


    }


}
