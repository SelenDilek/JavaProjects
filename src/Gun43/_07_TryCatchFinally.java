package Gun43;

public class _07_TryCatchFinally {
    public static void main(String[] args) {

        String str="";
        long starTime = 0; //int,long,float,double
        try {

            starTime=System.currentTimeMillis();
            System.out.println("Hatadan onceki kisim");
            char ilkHarf = str.charAt(0);
            System.out.println("Hatadan sonraki kisim");

        }catch (Exception ex){

            System.out.println("catch blogu calisti");

            //hata oldugunda yapilacaklar
        }

        finally { //hata olsa da olmasa da calisiyor. //mesela gecen sureyi hesapla gibi..
            //try catch ile ilgili bir islem yapmak istersek veya bu blogun disinda islem yapmak istersek mesela dosya kapatmak gibi.

            System.out.println("try catch blogu ile ilgili kodlar yazilir.");
            System.out.println(System.currentTimeMillis()-starTime);


        }

        System.out.println("diger calisacak kodlar");
        System.out.println("--PROGRAM BITTI--");

    }
}
