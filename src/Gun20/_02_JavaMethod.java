package Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) {

        //NOT: Java acik kaynak kodlari javanin kendi yazdigi kodlari gorebiliriz. Math.random() un uzerine ctrl+enter
        //yapinca javanin yazdigi kodlari gorebiliriz.!

      merhabaYaz(); //giden yok, donen yok
      toplamYaz(4,5); //giden var , donen yok
      int enb= Math.max(4,5); // giden var ,donen var
      double rndSayi= Math.random(); //giden yok, donen var

      /*********************************************/

      enBulYaz(4,5);
      enb=enBulGeriGonder(4,5); //gelen degeri kullanacaksam return methodunu yazarim. mesela burda yazdirmak icin cagirdim.
        //cagirdigim yerden kullanabilecem.
        System.out.println("enb = " + enb);

        //Javaya ait herhangi bir methodun uzerine CTRL ile tikladigimizda ,
        //methodun icerigini/kodlarini gorebiliriz.

    }

    public static  int enBulGeriGonder(int s1 , int s2){ //sirasiyla eslesiyor. sadece bir deger gonderebilirsin.

        int enb=0;
        if(s1>s2)
        enb=s1;  //return s1;

        else
          enb=s2; //return s2;


        return enb; //donecek elemanin tipini methodun adindan once yaziyoruz. //bir degere bagladik = enb ye cunku bir deger donecek.
    }



    public static  void enBulYaz(int s1 , int s2){ //sirasiyla eslesiyor //void=tipsiz sadece yazdirir.
        //VOID IN RETURN U YOK !!!

        if(s1>s2)
            System.out.println(s1 + "en buyuk");
        else
            System.out.println(s2 + "en buyuk");

    }

    public  static  void merhabaYaz(){

        System.out.println("Merhaba");
    }

    public  static  void toplamYaz(int s1 , int s2){

        System.out.println("Toplam = "+s1+s2);
    }




}
