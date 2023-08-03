package Gun40;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_JavaLocalTime {
    public static void main(String[] args) {
        //LocalTime : Tarih bilgisi icermez sadece saat,dak,san,nano sn icerir.

        LocalTime saat = LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());
        
        //kendimiz ozel format verelim

        DateTimeFormatter of1 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("saat.format(of1) = " + saat.format(of1));

        DateTimeFormatter of2 = DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat kk:mm = " + saat.format(of2)); //24 saat dilimi

        DateTimeFormatter of3 = DateTimeFormatter.ofPattern("hh:mm a"); //12 saat dilimi
        System.out.println("saat hh:mm  a = " + saat.format(of3));

        /**************************************************************/

        LocalTime saat1 = LocalTime.of(7,34,45); //saat bilgisi set etme
        System.out.println("saat1.format(of3) = " + saat1.format(of3));
        
        
        
        
        
        
    }
}
