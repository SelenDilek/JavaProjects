package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";
        cumle=cumle+"Bugun"; //Bugun
        cumle=cumle+" hava" ;
        cumle+=" cok soguk";

        System.out.println("cumle = " + cumle);
        System.out.println(cumle+"  degil mi"); //cumle degismedi kendisine atama lazim degismesi icin.
        //Bugun hava cok soguk

        System.out.println("cumle.concat(\" dun degildi\") = " + cumle.concat(" dun degildi")); //cumle yine degismedi.
        System.out.println("cumle = " + cumle);
        
        cumle.concat(" merhaba") ; //cumlenin degeri degismez, atama gerektirir.
        cumle=cumle+cumle.concat(" merhaba"); //atama yapildi cumle degisti.
        System.out.println("cumle = " + cumle);
        
        //String birlestirme islemlerinde pc yorulur bu yuzden ozel bir sinif turetmisler : StringBuilder
        
        
        //**********************StringBuiler*************************/
        
        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugun"); //direk kendisinine atiyor. esitleme gerekmiyor
        cumle2.append(" hava"); //direkt cumleye atama yapiyor.

        System.out.println("cumle2 = " + cumle2);

        /***************** , + , concat , StringBuilder 3 modelin hiz testi ***************/

        long startTime =System.currentTimeMillis();

        String test1="";

        for (int i = 0; i <10000 ; i++) {

            test1=test1+" merhaba";
        }

        System.out.println("+ icin gecen sure= " + (System.currentTimeMillis()-startTime) + " ms");
        
        
        
         startTime = System.currentTimeMillis();
        String test2="";

        for (int i = 0; i <10000 ; i++) {

            test2=test2.concat(" merhaba");
        }

        System.out.println("concat icin gecen sure= " + (System.currentTimeMillis()-startTime) + " ms");



        startTime = System.currentTimeMillis();
        StringBuilder test3= new StringBuilder();

        for (int i = 0; i <10000 ; i++) {

            test3.append(" merhaba");
        }

        System.out.println("StringBuilder icin gecen sure= " + (System.currentTimeMillis()-startTime) + " ms");

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("\n\n*******************************************\n\n");
        
        /* StringBuilder i yakindan taniyalim */
        
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Bugun "); //kendine ekleme, atama gerektirmiyor
        sb.append("hava ");
        sb.append("biraz soguk ");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());

        sb.append(4);
        System.out.println("sb = " + sb);
        
        sb.reverse(); //Stringi ters ceviriyor
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);
        
        sb.delete(0,5); //0 dahil 5 haric siler index e gore.
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); //sadece belirtilen indexteki karakteri siler.
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime "); //5 nolu indexe kelimeyi ekle , araya ekleme
        System.out.println("sb = " + sb);


        String parca =sb.substring(5,8); //5 dahil 8 degil
        System.out.println("sb parca = " + parca);

        //string fonksiyonlar icin toString demek yeterli

        sb.toString().endsWith("de");

        sb.replace(5,8,"sac"); //verilen araliga verilen kelime eklenir.
        System.out.println("sb = " + sb);

        sb=new StringBuilder(); //tamamen sifirlamak yenilemek.
        sb=new StringBuilder("Bugun hava soguk"); //tanimlama aninda ilk atama yapilabilir.

        StringBuffer sBuffer = new StringBuffer(); //tamamen StringBuilder ayni
        //tek farki paralel calisan yazilimlar icin kullanilir.(ayni anda iki kodun calismasi)



        





    }
}
