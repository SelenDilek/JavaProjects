package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _04_JavaMap {
    public static void main(String[] args) {

        //Bir kartvizit uygulamasini 2 kisi icin yapiniz

        Map<String,String> ugurKartvizit = new HashMap<>();
        ugurKartvizit.put("isim" ,"Ugur Yilmaz");
        ugurKartvizit.put("email" ,"ugur@gmail.com");
        ugurKartvizit.put("adres" ,"Cekmekoy/Istanbul");
        ugurKartvizit.put("telefon" ,"05353889876");


        System.out.println("ugurKartvizit.get(isim) = " + ugurKartvizit.get("isim"));
        System.out.println("ugurKartvizit.get(email) = " + ugurKartvizit.get("email"));

        Map<String,String> zaferKartvizit = new HashMap<>();
        zaferKartvizit.put("isim" ,"Zafer Canli");
        zaferKartvizit.put("email" ,"zafer@gmail.com");
        zaferKartvizit.put("adres" ,"Umraniye/Istanbul");
        zaferKartvizit.put("telefon" ,"053538489356");

        System.out.println("zaferKartvizit.get(isim) = " + zaferKartvizit.get("isim"));
        System.out.println("zaferKartvizit.get(email) = " + zaferKartvizit.get("email"));



        Map<String, Map<String,String>> kartvizitler = new HashMap<>();
        kartvizitler.put("ugur" , ugurKartvizit); // key leri ben belirliyorum anahtarliyorum
        kartvizitler.put("zafer", zaferKartvizit);

        System.out.println(kartvizitler.get("zafer").get("adres")); // zaferin adresi
        System.out.println(kartvizitler.get("ugur").get("email")); //ugurun maili


        for(Map.Entry< String, Map<String,String> > kv :kartvizitler.entrySet()){ //enterySet : keys+values

            System.out.println("kv = " + kv);
            System.out.println("kv.getValue() = " + kv.getValue());

            System.out.println(" kv.getValue().get(email) = " + kv.getValue().get("email"));
        }



    }
}
