package Gun04;

public class _08_Ornek4 {
    public static void main(String[] args) {
        //int to string , rakamlari yaziya cevrilmesi.Soldan baslar so okumaya.

        String ad = "Selen Dilek";
        int sinif=5;
        char subesi='A';
        boolean gectiMi=true ;
        System.out.println(ad+ sinif+ gectiMi+subesi);
        //islem her zaman soldan baslar. + nin herhangi bir tarafinda String var ise, diger degisken otomatik String e donusur.

        System.out.println("merhaba"+1+2); //ilk merhaba ile 1 i yazdirir sonra string oldugunu anlar ve 2 yi de yanlarina string olarak yazdirir.
        //merhaba12
        System.out.println(1+2+"merhaba"); //islem onceligi solda. 1 ve 2 yi gorur toplar. //3merhaba
        //parentez kullanabiliriz islem oncelikleri icin.
        System.out.println("merhaba"+(1+2)); //merhaba3
    }
}
