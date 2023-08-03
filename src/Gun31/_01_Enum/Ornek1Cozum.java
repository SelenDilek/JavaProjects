package Gun31._01_Enum;

//// Yazılım dillerinde enum, enumaration ve enum sabitleri
//// olarak adladırılmaktadır. Tanımlanan değişkenlerin
//// sabit değer alması için kullanılır. Tanımlanan
//// bu sabit değerler bir grup oluşturur. Erişilmesi,
//// yönetilmesi ve anlaşılması kolay hale gelir.

//enum Aylar{

    //BUNLARI SIMGE OLARAK KABUL ETTI ARKADA NUMARALANDIRDI.her yerde bunlari boyle kullanacam itiraz edemeyecek.
    //Amac rakam kullanmamak simge kullanmak!

   // Tanimsiz , OCAK , SUBAT , MART , NISAN , MAYIS ,HAZIRAN,
  //  TEMMUZ , AGUSTOS , EYLUL ,EKIM , KASIM , ARALIK

//}


public class Ornek1Cozum {
    //enumaration : numaralandirilmis simgeler
    //numara ve simge eslestirilmesi lazim (numaralandirilmis kelimeler)

    //class in icinde de ENUM tanimlanabilir , ancak METODLARIN icine tanimlanamaz!!


    public static void main(String[] args) {
        //program okunabilir oldu hata olasiligim azaldi.


        Aylar ay =Aylar.MAYIS;
        switch (ay){

            case SUBAT : //aslinda SUBAT yerinde 2 var bilgisayarda rakam bende simge olarak gozukuyor
                System.out.println(28); break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
                System.out.println(31); break;
            case ARALIK:
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL:
                System.out.println(30); break;


        }

        if(ay==Aylar.MAYIS)
            System.out.println("Zam ayi");

        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.toString() = " + ay.toString());
        System.out.println("ay.ordinal() = " + ay.ordinal());
        System.out.println(Aylar.values().length);


        for(Aylar a : Aylar.values()){


            System.out.println(a.name() + " - " + a.ordinal());
        }
    }




}
