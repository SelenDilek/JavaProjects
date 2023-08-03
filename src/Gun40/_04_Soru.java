package Gun40;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _04_Soru {
    public static void main(String[] args) throws InterruptedException {
        //Canli dijital saat yapiniz.
        //21:32:45 --> 21:32:46  --> 21:32:47...  21:33:00 --> ... devam // ayni yere yazacak


        DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss");


      while (true){ //her zaman yazdirir
          LocalTime saat =LocalTime.now();
          System.out.print("\r" + saat.format(f)); //r yazarken sil en basa tekrardan yaz.
          //1 sn bekle
          Thread.sleep(1000);

      }








    }
}
