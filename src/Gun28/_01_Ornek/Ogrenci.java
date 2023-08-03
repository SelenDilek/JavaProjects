package Gun28._01_Ornek;

public class Ogrenci {

    int id ;
    String ad ;
    String soyad ;
    int sinif ;

    //yapici method , Constructer metodlar
    public  Ogrenci(){

        System.out.println("Nesne olusturuldu");
    }

    //genelde ilk degerleri olusturmam icin kullanirim

    //yapici method , Constructer metodlar
    public  Ogrenci(int id ,String ad ,String soyad , int sinif){

        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinif=sinif; //this kendi demek.

        System.out.println("Nesne olusturuldu");
    }


    //yapici method , Constructer metodlar

    public  Ogrenci(int id ,String ad ,String soyad ){

        this(id,ad,soyad,0); //this =Ogrenci anlamina geliyor.Kendisi.
        //this.id=id;
        //this.ad=ad;
        //this.soyad=soyad;
        //this.sinif=0; //this kendi demek.

        System.out.println("Nesne olusturuldu");
    }
}
