package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_JavaTryMultipleCatch {
    public static void main(String[] args) {

        System.out.println("Program basladi");
        boolean dogruCalisti=true ;
        try
        {
        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi1=");
        int sayi1 = oku.nextInt();

        System.out.print("Sayi2=");
        int sayi2 = oku.nextInt();

        int bolum = sayi1 / sayi2;
        System.out.println("bolum = " + bolum);

        String kelime=""; //genel hataya dusmesi icin yapildi
        kelime.charAt(3);


    } catch (ArithmeticException ex) { //belirli bir hata : case


            System.out.println("Sifira bolme hatasi olustu");
        }

            catch (InputMismatchException ex) { //belirli bir hata : case


            System.out.println("Lutfen Sayi girinizzz");
        }

        catch (Exception ex) { //genel hata swtich deki default gibi yukaridakilerin disinda gelen hata icin!


            System.out.println("Beklenmeyen hata olustu !");
        }
    }
}
