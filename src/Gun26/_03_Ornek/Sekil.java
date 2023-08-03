package Gun26._03_Ornek;

public class Sekil {
    // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.
    //         (properties, fields, özellik, eleman, items,attribute) : width(int), length(int)
    // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
    // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
    // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.

    public static void main(String[] args) {


        Rectangle r = new Rectangle();
        r.lenght=5 ;
        r.width=4 ;

        System.out.println("rg1.width = " + r.width);
        System.out.println("rg1.lenght = " + r.lenght);

        r.Alan();
        r.Cevre();
        
        int cevre2 = r.Cevre2();
        int alan2 = r.Alan2();
        System.out.println("cevre2 = " + cevre2);
        System.out.println("alan2 = " + alan2);
        System.out.println("r.Cevre2() = " + r.Cevre2());
        System.out.println("r.Alan2() = " + r.Alan2());





    }
}
