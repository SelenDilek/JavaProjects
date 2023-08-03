package Gun07;

public class Ornek2 {
    public static void main(String[] args) {

        String numara = "+90507001215121?" ;
        numara.startsWith("+");
        System.out.println("Startwith = " + numara.startsWith("+90"));
        numara.contains("+90");
        System.out.println(" numara +90 mi ? = "+numara.contains("+90"));



    }
}
