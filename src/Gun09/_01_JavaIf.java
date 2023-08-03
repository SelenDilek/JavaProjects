package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        //baklava dilimimiz
        //girilen bir sayi 10dan buyuk ise ekrana 10 buyuk yazdiriniz.
        //1- Basla {
        //2- sayi oku  sayi=oku.nextInt();
        //3- sayi>10 ise "10dan buyuk" yaz if(sayi>10) sout..
        //4- Dur }


        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi= ");
        int sayi = oku.nextInt();

        if(sayi>10 )//normal parantez sart
        { // if in sarti saglandiginda calisacak bolum
            //suslu parantez yoksa sadece birinci satiri algilar.
            //kod yukaridan asagiya calisir
            System.out.println("10 dan buyuk");
            System.out.println("if deyimi kullanildi");
        }
        //{} parantezlerini her zaman kullanbilirsiniz ,
            //ancak if sarti saglandiginda calisacak tek bir komut var ise
            //kullanmak zorunlu degildir.







    }
}
