package Gun07;

public class _03_StringEquals {
    public static void main(String[] args) {
        //equals : 2 stringin birbirine esit olup olmadigini kontrol eder.
        // sonuc boolean
        String s1= "Merhaba";
        String s2= "MERHABA";

       boolean esitMi= s1.equals(s2);
        System.out.println("esitMi = " + esitMi);
        System.out.println("esitMi = " + s1.equals(s2));

    }
}
