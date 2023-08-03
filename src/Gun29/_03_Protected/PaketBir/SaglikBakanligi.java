package Gun29._03_Protected.PaketBir;

public class SaglikBakanligi {
    public static void main(String[] args) {

        Doctor doktor1 = new Doctor();
        doktor1.hastaneAd="Numune Hastanesi";
        doktor1.adi="Selen";
        doktor1.bolumu= "Dahiliye";

        Doctor doktor2 = new Doctor("Mehmet");

    }

}
