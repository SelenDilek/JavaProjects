package Gun30;

public class KimlerDinledi {

    int a ;
    static int b=0;

    void artis(){
        //a ataniyor ama b de etkileniyor.
        a++;
        b++;
    }


    public static void main(String[] args) {

        KimlerDinledi kd1 = new KimlerDinledi();
        kd1.a=5;

        KimlerDinledi kd2 = new KimlerDinledi();
        kd2.a=7;

        //1.soru a nin degeri su anda kactir?
        //Burada her nesnenin a si var ve kd1 in 5 , kd2 nin ise 7 degeri vardir.

        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);

        //2.Soru b nin degeri kactir? tek bir degeri vardir o da sifirdir.

        kd1.artis();
        kd2.artis();

        System.out.println("kd1 = " + kd1.a); // kd1.a -> 6 , b-> 1
        System.out.println("kd2 = " + kd2.a); // kd1.a -> 8 , b-> 2
        System.out.println("b = " + b); //b=2 ;




    }


}
