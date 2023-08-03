package Gun28._04_0rnek;

public class Main {
    public static void main(String[] args) {
        Banka banka = new Banka();
        banka.bankaAdi="AKBANK";
        banka.kurulusYili=1880;
        banka.subeSayisi=1000;

        System.out.println("banka = " + banka);
        
        
        
        Banka banka1 = new Banka("Ziraat Bankasi" , 1345 , 1996);
        System.out.println("banka1 = " + banka1.toString());

        Banka banka2 = new Banka("Garanti Bankasi" , 1946);
        System.out.println("banka2 = " + banka2);

        Banka banka3 = new Banka("ING Bankasi" , 1653,1997);
        System.out.println("banka3 = " + banka3);

        Banka banka4 = new Banka("FINANSBANK Bankasi");
        System.out.println("banka4 = " + banka4);


    }
}
