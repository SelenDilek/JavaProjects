package Gun07;

public class _02_StringContains {
    public static void main(String[] args) {
        
        String cumle = "Merhaba Dunya";
        Boolean varMi= cumle.contains("a"); //contains boolean dondurur uzerine gelip bakinca boolean yazar
        System.out.println("varMi = " + varMi);

        System.out.println("varMi a = " + cumle.contains("a")); //true
        System.out.println("varMi ya = " + cumle.contains("ya")); //true
        System.out.println("varMi z= " + cumle.contains("z")); //false


        
        
        
        
    }
}
