package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        int toplam = 6700;
        byte sayi = 5 ;

        sayi=(byte)toplam ; //veri kaybi olmasa bile dikkatli yapilmali cunku veri kaybi olmayacagini sadece programci biliyor.
        System.out.println("sayi = " + sayi); //6700 5 e sigmaz kendisi bir deger atiyor dogru degil dogru olmadiktan sonra veri kaybi oluyor.

        double oran = 3.7 ; //elimde double var fakat ben tam sayi almak istiyorum.

        toplam= (int) oran; //veri kaybi var bilerek sadece tam sayi kismini aldim.
        System.out.println("toplam = " + toplam);
        //veri kaybi var , fakat bilerek yaptigim icin sorun yok.

        sayi= (byte) oran;
        System.out.println("oran = " + oran);

        //int igrnot=50;
        //byte ogrNot2=(byte)igrnot













    }
}
