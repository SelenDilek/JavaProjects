package Gun29._03_Protected.PaketBir;

public class Doctor {
     public String hastaneAd ; //diger paketlerden erisim izni verildi.
     String adi;     //default olsun
     protected String bolumu; // default ile ayni
     private String SicilNo; //private sadece class icinden erisilebilir.


      Doctor() { //sadece kendi paketindekiler erisebilir
     }

     public Doctor(String adi) { //diger tum paketlerden de erisilebilir
         this.adi = adi;
     }
 }
