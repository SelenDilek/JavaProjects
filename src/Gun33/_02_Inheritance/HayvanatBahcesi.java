package Gun33._02_Inheritance;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kedi1 = new Kedi("Siyah" , 3 , "Tekir");
        System.out.println("kedi1 = " + kedi1);
        kedi1.konustu();

        Kopek kopek1 = new Kopek("Beyaz",50.5,"Kangal");
        System.out.println("kopek1 = " + kopek1);
        kopek1.konustu();
        
        Yilan yilan1 = new Yilan("Siyah" , 3 , "Engerek" , 3);
        yilan1.konustu();
        System.out.println("yilan1 = " + yilan1);

        Ordek ordek1 = new Ordek("Yesil" , 2.4 , "Govel" , 90);
        ordek1.konustu();
        System.out.println("ordek1 = " + ordek1);
        
        
        
    }
}
