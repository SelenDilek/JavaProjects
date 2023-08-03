package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
// 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan
        // Random atayarak doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1,
        // çift olanlara 0 atayınız  yazdırınız.

        /*int dizi[]=new int[50];

        for(int i=0 ; i< dizi.length ; i++){

            int randomSayi = (int) (Math.random()*10 );
            dizi[i]=randomSayi;

            System.out.println("dizi[i] = " + dizi[i] + " , ");
            System.out.print("randomSayi = " + randomSayi + " ,");
        }


        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2==0){
                dizi[i]=0;                                 BURASI BENIM COZUMUM SONUC DOGRU!

            }
            else {
                dizi[i] = 1;
            }


            System.out.println("dizi[i] = " + dizi[i]);
        }
        */

        //ayri ayri for kullanma amacimiz rahat gormek hem islemi hem yazma kismini. Tek for da da yapabilirdik!

        int dizi[]=new int[50];

        for(int i=0 ; i< dizi.length ; i++){ //islem icin kullandigim loop

            dizi[i]= (int) (Math.random()*10 );

            }

        for(int i=0 ; i< dizi.length ; i++){ //yazdirmak icin ve rahat gormek icin ayri bir loop kullandik

            System.out.println("dizi once=" + dizi[i]);
        }

        for(int i=0 ; i< dizi.length ; i++){  //islem icin kullandigim loop
                if(dizi[i]%2==0){
                    dizi[i]=0;

                }
                else {
                    dizi[i] = 1;
                }
        }

        for(int i=0 ; i< dizi.length ; i++){  //yazdirmak icin ayri bir loop kullandik

            System.out.println("dizi sonra=" + dizi[i]);
        }


        //TEK FOR KULLANMAK ISTERSEK :

        for (int i = 0; i < dizi.length; i++)  {

            dizi[i] = (int)(Math.random()*10);

            System.out.println("dizi önce= "+dizi[i]);


            if (dizi[i]%2 == 0)  // çiftse
                dizi[i]=0;
            else
                dizi[i]=1;

            System.out.println("dizi sonra= "+dizi[i]);

        }












    }
}
