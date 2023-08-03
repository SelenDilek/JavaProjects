package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) throws InterruptedException {
        // TODO : Şu anki saati / kullanıcıdan alınan saati geriye doğru saniye saniye saydırınız.
        // 19:35:56  formatındaki

        //Kullanicidan alinan saati:

        Scanner okuStr = new Scanner(System.in);
        System.out.print("Saat giriniz: (19:35:56)=");
        String kullaniciSaat = okuStr.nextLine();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss");

        LocalTime time = LocalTime.parse(kullaniciSaat,f);

       while(true){

            time=time.minusSeconds(1);
           System.out.print("\r" + time.format(f));
            Thread.sleep(1000);

        }


        //Suanki Saati :


       // LocalTime localTime = LocalTime.now();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("kk:mm:ss");

       // while (true){

         //   localTime=localTime.minusSeconds(1);
           // System.out.print("\r" + localTime.format(formatter));
         //   Thread.sleep(2000);


        //}


    }
}
