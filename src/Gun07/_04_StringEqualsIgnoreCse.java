package Gun07;

public class _04_StringEqualsIgnoreCse {
    public static void main(String[] args) {
        //EqualsIgnoreCase:
        ////equals ayni calisir sadece buyuk kucuk harf farketmez.
        String s1 = "Merhaba";
        String s2= "MERHABA";


        System.out.println("s1.equals(s2) = " + s1.equals(s2)); //false
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2)); //true



        
        
    }
}
