package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        //Period 2 tarih arasindaki farki tutar ;
        //LocalDate ler icin kullanilir

        LocalDate dogumTarihi = LocalDate.of(1998, 01, 17);
        LocalDate buGun = LocalDate.now();

        Period fark = Period.between(dogumTarihi, buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears() + " Yasindasiniz");

        /********************************************************/

        Period period3Gun = Period.ofDays(3);
        Period peryod2Gun=Period.ofDays(2);
        Period period3Ay = Period.ofMonths(3);
        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra = buGun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucGunSonra2 = buGun.plus(peryod2Gun);
        System.out.println("iki gun sonra = " + ucGunSonra2);
        
        LocalDate ucAySonra = buGun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);

        System.out.println("*****************************************");

        //1.soruKursun bitis tarihini bulunuz 6 ay : 15.05.2023

        LocalDate KursbaslangicTarihi=LocalDate.of(2023,5,15);
        Period kusrSure = Period.ofMonths(6);
        LocalDate kursBitis = KursbaslangicTarihi.plus(kusrSure);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());
        System.out.println("kursBitis.getDayOfMonth() = " + kursBitis.getDayOfMonth());


        //2.soru
        
       Period neKadarSureKaldi = Period.between(buGun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        //3.soru : Ne kadar suredur devam ediyor

        Period suAnaKadarDevamSuresi = Period.between(KursbaslangicTarihi,buGun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);
        System.out.println("suAnaKadarDevamSuresi.getMonths() = " + suAnaKadarDevamSuresi.getMonths());
        
        //zaman araligi denilince periyot

    }
}
