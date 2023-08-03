package Gun43;

import java.util.ArrayList;

public class _01_NesneObject {
    public static void main(String[] args) {

        //her sey bir nesnedir
        //Kisi ogr1 = new Student();
        //Object ogr1=new Student();

        ArrayList<Object> genelList=new ArrayList<>();
        genelList.add(1);
        genelList.add("ismet");
        genelList.add(3.5);
        genelList.add(true);
        //genelList.add(ogr);

        System.out.println("genelList = " + genelList);

        /// her tip eklenebilir cunku butun tipler Object den turetilmistir.
        
        
        double oran =10/3.0;

        System.out.println("oran = " + oran);

        //System.out.printf("formati" ,degiskenleri);

        System.out.printf("%f" , oran); //kesirli yaz demek //%f : % degiskenin gelecegi yer
                                                            // f : double , float kesirli olan her sey

        System.out.println();
        System.out.printf("sonuc = %4.1f" ,oran);
        //4 : toplamda 4 hane kullanical nokta dahil
        //1:noktadan sonra  kac hane kullanilacak

        System.out.printf("sonuc = %-4.1f\n" ,oran); //-sola dayali

        int sayi=5;
        System.out.printf("Sonuc= %-5.2f , tamSayi=%d",oran,sayi);
        //f: double veya float
        //d: decimal : tam sayi
        //s: string degiskenler




    }
}
