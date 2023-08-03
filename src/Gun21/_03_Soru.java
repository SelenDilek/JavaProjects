package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
// Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz
        
        //kac kere donecegi belli degil ve sart sonda ise do-while lazim.Kac tane ekleyecegi belirsiz oldugu icin dinamik lazim
        //array list

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();
        String cevap = "";
        int toplam = 0;

        do {
            System.out.print("Lutfen not giriniz :");
            int not = okuInt.nextInt();

            notlar.add(not);
            toplam = toplam + not;


            System.out.print("Devam etmek ister misiniz (E/H)= ");
             cevap = okuStr.nextLine().toUpperCase();

        }

        while (cevap.equalsIgnoreCase("E")); //E haricinde bir sey giriline kadar do calisir. E haric girilince asagi gecer.
        
        double ortalama= toplam/ notlar.size();
        System.out.println("ortalama= " + ortalama);

        int gecenSayisi=0;

        for (int i = 0; i <notlar.size() ; i++) {
            
            if(notlar.get(i)>= ortalama)
                gecenSayisi++;
        }

        System.out.println("gecenSayisi = " + gecenSayisi);


        }
    }
