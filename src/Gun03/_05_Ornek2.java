package Gun03;

public class _05_Ornek2 {
    public static void main(String[] args) {

        //Ornek soru: yaricapi(r) 4.2 olan bir dairenin cevresini ve alanini bulunuz.
        //cevre= 2*yaricap*3.14 ; alan=3.14*yariap*yaricap
        System.out.println("Yaricapi 4.2 olan dairenin cevresini ve alanini bulunuz ? ");
        double cevre ;
        double alan ;
        double yaricap = 4.2 ;
        double pi = 3.14 ;

        cevre=2*yaricap*pi ;
        alan=pi*yaricap*yaricap;


        System.out.println();
        System.out.println("Dairenin cevresi : " + cevre);
        System.out.println();
        System.out.println("Dairenin alani : " + alan);









    }
}
