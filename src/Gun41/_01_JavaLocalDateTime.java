package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _01_JavaLocalDateTime {
    public static void main(String[] args) {
        //LocalDateTime hem tarih hem de saat bilgisini tutar

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonth().getValue() = " + dt.getMonth().getValue());
        System.out.println("dt.getDayOfYear() = " + dt.getDayOfYear());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getDayOfWeek() = " + dt.getDayOfWeek());
        System.out.println("dt.getDayOfWeek() = " + dt.getDayOfWeek().getValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getNano() = " + dt.getNano());
        System.out.println("dt.format(DateTimeFormatter.ISO_DATE_TIME) = " + dt.format(DateTimeFormatter.ISO_DATE_TIME));
        
        //Ozel formatta istedigimiz gibi yazdirma

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.YYYY hh:mm");

        System.out.println("dt.format(f) = " + dt.format(f));


        //Asagidakiler birer zaman tutuyor.
        //LocalDate = tarih
        //LocalTime= saat(saat,dak,san,ns)
        //LocalDateTime = tarih+saat
        //DateTimeFormatter = format
        //int a=5;  bir a int cinsinden bir rakam tutuyor
       // yukarıdaki değişkenler kendi türünden bir zaman tutuyor
        
        //Zaman araligi tutan yapilar da var..
        
        
        
    }
}
