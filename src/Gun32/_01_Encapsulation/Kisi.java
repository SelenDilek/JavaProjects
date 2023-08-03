package Gun32._01_Encapsulation;

public class Kisi {

    //Kontrollu sekilde veri atanmasini sagladik ve koruduk
   private String ad ; //25 karakter siniri
   private String soyad ; //25 karakter siniri
   private int yas; //eksi deger girilmesin

   //hepsi kontrolden gecerek calismis oluyor
public void yasAta(int yas){


    if(yas<0)
        System.out.println("Hatali giris");
    else
        this.yas = yas ;

}

public void setAd(String ad){


    if(ad.length() < 25)
        this.ad=ad;
    else
        System.out.println("Hatali giris");
}

    public void setSoyad(String soyad){

        if(soyad.length() < 25)
            this.soyad=soyad;
        else
            System.out.println("Hatali giris");
    }

    public int yasVer(){

    return this.yas;
    }

    public String getAd(){

        return this.ad;
    }

    public String getSoyad(){

        return this.soyad;
    }


}
