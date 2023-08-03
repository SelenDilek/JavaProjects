package Gun43;

import java.util.Scanner;

public class _08_ThrowExample_02 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni sifre olusturma=");

        System.out.print("Yeni sifre=");
        String newPassword=oku.nextLine();


        try{

            if(newPassword.length()<8) //bu mesaj ile suni hata olustur
                throw new Exception("Sifre en az 8 karakterden olusmali");

            if(newPassword.length()>8) //bu mesaj ile suni hata olustur
                throw new Exception("Sifre en fazla 15 karakterden olusmali");


        }

        catch (Exception ex){

            //hatalar bir yere toplanip,hepsi icin yapilmasi gereken islemler
            //birarada burada yapilabilir. mesela log tutma gibi
            System.out.println("Lutfen dikkat");
            System.out.println(ex.getMessage()); //mesaji bizim olusturdugumuz new Exception dan alir.
            //hangi ip den baglandi kaydedersin
            //yapilacak ortak isler
        }



    }
}
