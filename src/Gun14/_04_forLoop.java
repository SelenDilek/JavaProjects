package Gun14;

public class _04_forLoop {
    public static void main(String[] args) {
// 0 den 10(dahil) kadar sayıları ekrana yazdırınız.
// 10 dan 0(dahil) kadar sayıları ekrana yazdırınız.(ayri bir diğer for)

      /*  int sayac=1 ;
        while (sayac<=10){

            System.out.println(sayac);

            sayac++ ; //sonsuz donguye girmemesi icin lazim.
        }
*/


        for(int i=0 ; i<=10 ; i++ ){

            System.out.println(i);
        }

        for(int i=10 ; i>=0 ; i-- ){

            System.out.println(i);
        }


    }
}
