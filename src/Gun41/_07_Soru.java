package Gun41;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız bir Toplam rakamı, kullanıcının vereceği  başlangıç tarihine göre
        // yine kullanıcnın verdiği kadar taksit yaptırarak, ödeme planını ekrana yazdırınız.

        // Kullanıcıdan tarih, para miktarı ve taksit sayısı alınacak
        // Çıktı olarak taksit no, taksit tarihi, ödenecek miktar şeklinde liste verilecek

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        //Tarihi alalim

        System.out.print("Taksit Baslangic Tarihi (01.05.2023)= ");
        String strTarih= okuStr.nextLine();
        LocalDate basTarihi = LocalDate.parse(strTarih,f);

        //Toplam Para Miktarini alalim

        System.out.print("Taksitlendirilecek Mik= ");
        int toplamPara = okuInt.nextInt();

        //Taksit Sayisi

        System.out.print("Taksit Sayisi= ");
        int takSay = okuInt.nextInt();

        int taksitMik = toplamPara/takSay ; //1 aya dusen odeme (para miktari)

        System.out.println("********* ODEME PLANINIZ ****************");
        for (int i = 1; i <=takSay ; i++) {
            System.out.print(i);
            System.out.print(" " + basTarihi.plusMonths(i-1).format(f));
            System.out.println(" " + taksitMik + " $");

        }


















    }
}
