package Gun34._03_Soru;

public class OkulMain {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("ismet", "SAY");
        LiseOgrencisi lo2=new LiseOgrencisi("mehmet", "SÖZ");
        IlkOgrencisi io1=new IlkOgrencisi("Ayşe", "Müzik");
        IlkOgrencisi io2=new IlkOgrencisi("Ayşe", "Resim");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);
        System.out.println("io2 = " + io2);
    }
}
