package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {
        
        //Duration : localTime ve LocalDateTime lar arasi fark icin kullanilir //duration=saat

        //Kodun performansini bulmak icin

        long startTime=System.currentTimeMillis();


        //LocalTime

        LocalTime dersBaslangic = LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(21,50,5);

        Duration gunlukDersSuresi = Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);

        System.out.println("gunlukDersSuresi.toDays() = " + gunlukDersSuresi.toDays()); //toplam hali
        System.out.println("gunlukDersSuresi.toHours() = " + gunlukDersSuresi.toHours()); //toplam hali
        System.out.println("gunlukDersSuresi.toMinutes() = " + gunlukDersSuresi.toMinutes()); //toplam hali
        System.out.println("gunlukDersSuresi.toNanos() = " + gunlukDersSuresi.toNanos()); //toplam hali


        System.out.println("************ LocalDateTime **********************");

        LocalDateTime from = LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to = LocalDateTime.now(); //bugun
        
        Duration fark = Duration.between(from,to);
        System.out.println("fark = " + fark);

        System.out.println("fark.toDays() = " + fark.toDays()); //farkin toplam gunu
        System.out.println("fark.toHours() = " + fark.toHours()); //farkin toplam saati
        System.out.println("fark.toMinutes() = " + fark.toMinutes()); //farkin toplam dakikasi

        long finishTime=System.currentTimeMillis();

        System.out.println("Gecen sure system performans = " + (finishTime-startTime) + " ms");
    }
}
