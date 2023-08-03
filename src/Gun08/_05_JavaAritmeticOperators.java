package Gun08;

public class _05_JavaAritmeticOperators {
    public static void main(String[] args) {
        int sayac = 0 ;
        sayac=sayac+1 ; //sayacin degerini bir tane artirir. = 1
        sayac ++ ; // bu da sayacin degerini bir artirir. = 2
        ++sayac ; // sayacin degerini bir artirir = 3
        
        sayac=sayac-1 ; //sayacin degerini bir azaltir =2
        sayac-- ; // sayacin degerini bir azaltir = 1
        --sayac ; //sayaci bir azaltir = 0

        System.out.println("sayac = " + sayac);

        /********************************************/

        int toplam =0 , sayi = 0 ;
        //islemden once : toplam=0 , sayi=0
        toplam=5+sayi ;
        //islemden sonra: toplam=5 , sayi=0

        /******************************************/

        toplam=0 ; sayi =0 ;

        //islemden once: toplam=0 , sayi=0
        toplam=5 + sayi ++ ; //once toplar toplama atar daha sonra sayiyi bir artirir
        //islemden sonra: toplam=5 , sayi=1

        //toplam= 5+sayi;
        //sayi++;

        /*****************************/
        toplam =0 ; sayi=0 ;
        //islemden once toplam =0  , sayi=1 ;
        toplam=5 +  ++sayi ;
        //islemden sonra toplam=6  , sayac=1

        sayi++ ;
        toplam= 5 + sayi ;

        //Ozet : ++ lar sagda ise once islem sonra artis
        // ++ lar solda ise once artis sonra islem
        
        
        
        
    }
}
