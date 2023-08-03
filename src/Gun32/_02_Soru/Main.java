package Gun32._02_Soru;

//Encapsulation : private parametreler , getter-setter olustur ve set icini kuralla , set ile yaz get ile yazdir
//constructer i bos ve dolu olustur , dolu icine yine set methodlarini yazdir.

public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.setRenk("Mavi");
        araba.setModel(1885);
        araba.setMotorHacmi(1900);
        araba.setKapiSayisi(4);

        System.out.println("araba.getRenk() = " + araba.getRenk());
        System.out.println("araba.getModel() = " + araba.getModel());
        System.out.println("araba.getKapiSayisi() = " + araba.getKapiSayisi());
        System.out.println("araba.getMotorHacmi() = " + araba.getMotorHacmi());

        //Acik kapi  var halen : constructer icine gelen degeri yine yazdigim fonksiyona(metoda) yollamam lazim !!

        Araba a2 = new Araba("siyah" , 2045 , 5000 , 23);
        System.out.println("a2 = " + a2);

        //NOT : TUM SATIRLARI YORUMA ALMA : CTRL+\


        //KURAL: genel yazilim kuralidir.
        //butun degiskenler private yapilir
        //yani kapsulleme kullanilir
        //eger gerekiyorsa private kaldirilir.
        
    }
}
