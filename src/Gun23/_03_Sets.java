package Gun23;

import java.util.*;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red"); //tekrar deger eklenmesi basarisiz
        renkler.add("RED");
        System.out.println("renkler = " + renkler);

        for(String eleman: renkler) { //sira garanti degil (index yok o yuzden boyle yazdiriyoruz Set lerde)
            System.out.println("eleman = " + eleman);

        }

        //foreach (herhangi biri demek : sira garanti degil)
        
     //   Integer [] dizi = {34,5,6,7,8,89,899,77};
     //   for(int eleman :dizi){
        //    System.out.println("eleman = " + eleman);
       // }

       // ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(dizi));

       // for(Integer e :liste){ //icindeki eleman tipini yaziyoruz = integer , string .. //each =herhangi biri sira karisik.

         //   System.out.println("e = " + e);
     //   }


        //foreach sira granti degil sira garanti olsun isterse :
        //hasset de index yok konum yok sirali yazmak icin:Iterator gosterge demektir.

        Iterator gosterge = renkler.iterator(); //sirayi garanti ediyor
        while (gosterge.hasNext()) //sirada halen eleman var ise
        {
            System.out.println("gosterge.next() = " + gosterge.next());
            //.Next  gostergenin gosterdigi elemani temsil ediyor.

        }
        
        
    }
}
