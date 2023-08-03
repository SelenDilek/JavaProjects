package Gun25._01_Ornek;

//class-tipleririn tanimlandigi yer

public class _01_JavaClassAndObject {


    //methodlarin yazilabildigi yer
    public static void main(String[] args) { //basla
        //ana programin calistigi yer
        Ogrenci ogr1 = new Ogrenci();

        ogr1.okulNo=1001 ;
        ogr1.adi="Ahmet";
        ogr1.soyadi="Yilmaz" ;
        ogr1.adresi="Cekmekoy/Istanbul";
        ogr1.telefonu= "05567899809";
        ogr1.sinifi= 6 ;

        System.out.println(ogr1.adi);
        System.out.println(ogr1.soyadi);
        System.out.println(ogr1.adresi);





    } //dur



    //metodlarin yazilabildigi yer
}
class Ogrenci{ //ogrenci tipi
    int okulNo ;
    String adi ;
    String soyadi ;
    int sinifi ;
    String adresi ;
    String telefonu ;





}


