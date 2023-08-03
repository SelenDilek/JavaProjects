package Gun15;

import java.util.Scanner;

public class _04_Continue {
    public static void main(String[] args) {
        //Kulanicidan 5 sayi isteyiniz.
        //Bu sayilardan 6 ile 10 arasindakiler haric digerlerini toplansin

        Scanner  oku = new Scanner(System.in);

        int toplam=0;

        for (int i =1 ; i<=5 ; i++){

            System.out.print("Sayi giriniz=");
            int sayi= oku.nextInt();


            if(sayi>6 && sayi<10)
                continue; //pass gec;kendinden sonra gelen komutlari pass gecer.
                          //dongunun sonraki adimina gecer.
            //olustudugum sarti gormezden gel isleme dahil etme.

            toplam=toplam+sayi;
            System.out.println(" Continue calismadi!");
        }

        System.out.println("toplam = " + toplam);








    }
}
