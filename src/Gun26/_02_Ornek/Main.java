package Gun26._02_Ornek;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //1.yol
        Person cal1 = new Person();
        cal1.name="Senol";
        cal1.surname="Dogan";
        cal1.age=20;


        Person cal2 = new Person();
        cal2.name="Sekol";
        cal2.surname="Rsutlemi";
        cal2.age=25;

        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surname = " + cal1.surname);
        System.out.println("cal1.age = " + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surname = " + cal2.surname);
        System.out.println("cal2.age = " + cal2.age);

        //2.yol
        BilgiYazdir(cal1);
        BilgiYazdir(cal2);

        //3.yol
        cal1.BilgiYazdir();
        cal2.BilgiYazdir();

        //4.yol
        //ArrayList<Integer> list = new ArrayList<>();
        //System.out.println("list = " + list.toString());

        System.out.println("cal1 = " + cal1.toString()); //cal1.toString()//cal1 zaten String modunda
        System.out.println("cal2 = " + cal2); //cal2.toString()
        //toString default tur. sout yazdirma yani string oldugu icin

        cal1.getBirthYear();
        cal2.getBirthYear();

        System.out.println(cal1.getBirthYear2());
        System.out.println(cal2.getBirthYear2());
    }

    public static void BilgiYazdir(Person cal){

//2.yol
        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surname = " + cal.surname);
        System.out.println("cal.age = " + cal.age);
    }
}
