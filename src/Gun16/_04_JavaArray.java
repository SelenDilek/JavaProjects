package Gun16;

public class _04_JavaArray {
    public static void main(String[] args) {
        int[] dizi = new int[5]; // 0,1,2,3,4 indexli 5 elemanli bir dizi tanimladim. int sayi;
        int[]dizi2 = {3,6,44,55,77}; //5 elemanli dizi, hem tanimlandi hem deger atandi. int sayi=5;


        String[] cumleler = new String[5]; //5 tane cumle saklayabilen bir String dizi degiskeni

        boolean[] dizi3 = new boolean[5]; //5 tane true/false saklayabilen bir dizi degiskeni

        double[] oranlar = new double[5]; // 5 tane double saklayabilen bir dizi degiskeni

        for (int i = 0; i <dizi.length ; i++) {
            System.out.println("dizi=" + dizi[i]);
        }


        for (int i = 0; i <dizi3.length ; i++) {
            System.out.println("boolean=" + dizi3[i]);
        }

        for (int i = 0; i <oranlar.length ; i++) {
            System.out.println("oranlar=" + oranlar[i]);
        }

        for (int i = 0; i < cumleler.length; i++) {
            System.out.println("cumleler=" + cumleler[i]);
        }









    }
}
