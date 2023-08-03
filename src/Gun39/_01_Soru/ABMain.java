package Gun39._01_Soru;

public class ABMain {
    public static void main(String[] args) {
        //statik nesneye bagli degil ama constructer olusturursak mesaj o classa atanir.
        //statik oldugu icin classtan ulasilir.
        A a = new  A();
        System.out.println(A.mesaj); //A

        B b =new B(); //etksi var ,constructer calisti sistemde bulunan tek olan mesaja esitlendi yani A ya.
        System.out.println(A.mesaj); //B

        A a2 = new A(); //etkisi yok cunku constructra atama yok.
        System.out.println(A.mesaj); //B (en son deger ne ise onu yazdirir cunku contruster yok atanan deger halen duruyor A da)
    }
}

//statik tektir en son atanan degeri alir.

//constructer atama yapiyor.(mesela nesne uretirsek nesne dunyaya geliyor construda da tanimlamasi yapiliyor.)
//statik zaten var construterda atama yaptik.