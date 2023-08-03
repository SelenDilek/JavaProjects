package Tools;

public class MyFunc {
    public  static  int enbBul(int s1 , int s2){ //methodunimzasi //1.yol

        int enb=0;
        if(s1>s2)
            enb=s1;
        else
            enb=s2;


        return  enb;
    }

    public  static  int rndTamSayi(int sinir){ //methodunimzasi //1.yol

        int rndSayi = (int) ( Math.random()*(sinir+1));

        return rndSayi;
    }

    public static void bekle(int sn){
        //try catch e alirsam diger yerlerde cagirdigim zaman tekrar try catch istemez. ama imzasi olarak hata yazsaydim diger yerlerde de isterdi
        try {
            Thread.sleep(1000 + sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
