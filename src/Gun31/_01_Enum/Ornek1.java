package Gun31._01_Enum;

public class Ornek1 {
    public static void main(String[] args) {
        //Verilen bir ay nosuna gore ayin kac gun surdugunu veren programi yaziniz.
        //Neye gore yazmis?  Hatali mi yazdi , numaralar neyi temsil ediyor? //Bu program okunabilir kontrollu degil
        // yanlislikla 22 de yazabiliriz. Mesela 1 ocagi temsil ediyor ama bu benim kafamda.Diger programcilar bilemiyor.


        int ayNo=5 ;

        switch (ayNo){

            case 2 :
                System.out.println(28);
                break;
            case 1 :
            case 3 :
            case 5 :
            case 22 :
            case 10 :
            case 12 :  System.out.println(31);
                break;

            case 4 :
            case 6 :
            case 11 :


        }

        //yazarken kucuk buyuk harf yazabilirsin bunu kontrol etmemiz lazim.
        // okunabilirlik ve kontrollü yazılım yok, tanımlama yetersiz
        // numaradan gitmeye çalıştık, zorluklarla karşılaştık
        // bunun yerine isimden gitmeye çalışalım

        String ayAd="Mayis";
        switch (ayAd){

            case "subat" :
                System.out.println(28); break;
            case "ocak":
            case "ocakk":
            case "MaRT":
            case "AGUSTOS":
            case "Aralik":
                System.out.println(31); break;
            case "temuz":
            case "eyll":
            case "Ekim":
            case "KASIM":
                System.out.println(30); break;


        }


        //1 - 0 bilgisayarin anlayacagi ama true false string yani benim anlayacagim tarzi
        //false diyince bilgisayar 0 algiliyor
        //eslesmis degerler var
        //boolean lambaAcikMi = true; //true veya false (1-0)


//        if (kullanci ==  kullaniciTipi.Ogretmen){  // 0
//            ders açma butonunu göster
//        }
//        else
//            if (kullancici == kullaniciTip.Ogrenci){ // 1
//              ders açma butonunu gösterme
//            }


// Boolean lambaAcikmi= true; //1 false 0



    }
}
