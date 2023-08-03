package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {
        //zone saatlere gore , local dillere gore

        ZonedDateTime zdt = ZonedDateTime.now();
        //suanda benim bulundugum yerin default zamanini veriyor.
        //LocalDateTime.now(); 
        //diger zonelar icin ZonedDateTime.now(ZoneId)

        System.out.println("zdt = " + zdt);
        //2023-07-20T14:03:04.038614200-04:00[America/New_York]
        //America/New York : ZoneId

        //Locale.getAvailableLocales();

       Set<String> zamanZoneIdleri =  ZoneId.getAvailableZoneIds(); //zoneId bOLGE
        for(String z : zamanZoneIdleri){

            if(! z.toLowerCase().contains("bul")) continue; //Istanbul saati icin , bul yoksa yazma //continue calisirsa alt satirini gormez pass gecer(sysout)
            
            System.out.println("z = " + z);
        }
       


        ZoneId zoneIdIstanbul = ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul= ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);

        //zoneIstanbul = 2023-07-20T21:09:36.049176500+03:00[Europe/Istanbul]
    }
}
