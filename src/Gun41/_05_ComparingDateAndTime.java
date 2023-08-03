package Gun41;

import java.time.LocalDate;

public class _05_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate buGun = LocalDate.now();
        LocalDate dun= buGun.minusDays(1);
        
        boolean sonraMi= buGun.isAfter(dun); //bugun dunden sonra mi
        System.out.println("sonraMi = " + sonraMi);
        
        boolean onceMi = buGun.isBefore(dun); //bugun dunden once mi
        System.out.println("onceMi = " + onceMi);
        
        boolean esitMi = buGun.isEqual(dun); //bugun dune esit mi
        System.out.println("esitMi = " + esitMi);
        
        boolean artikYilmi=buGun.isLeapYear(); //bugunun bulundugu yil artik yil mi
        System.out.println("artikYilmi = " + artikYilmi);
    }
}
