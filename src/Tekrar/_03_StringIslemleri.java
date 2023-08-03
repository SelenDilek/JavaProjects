package Tekrar;

public class _03_StringIslemleri {
    public static void main(String[] args) {
        //            012345678901
        String tamAd = "mahmut Temur"; // leng 12

        String isim = tamAd.substring(0, 4); // 0,1,2,3

        System.out.println("isim = " + isim);

        int boslukIndex = tamAd.indexOf(" ");
        System.out.println("boslukIndex = " + boslukIndex);

        isim = tamAd.substring(0, boslukIndex);
        System.out.println("isim = " + isim);

        String soyisim = tamAd.substring(boslukIndex + 1, tamAd.length());// 7-11
        System.out.println("soyisim = " + soyisim);


        String soyisim2 = tamAd.substring(boslukIndex + 1); // 2 değer yoksa , sonuna kadar
        System.out.println("soyisim2 = " + soyisim2);

        System.out.println("tamAd.charAt() = " + tamAd.charAt( tamAd.length()-1)); // son karakter

    }
}
