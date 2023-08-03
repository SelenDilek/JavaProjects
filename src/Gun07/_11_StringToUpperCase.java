package Gun07;

public class _11_StringToUpperCase {
    public static void main(String[] args) {
        //ToUpperCase: string buyuk harfe cevirir.
        
        String text = "Merhaba Dunya";

        System.out.println("orjinal hali = " + text);
        System.out.println("text.toUpperCase=" + text.toUpperCase());

        boolean bununlaBasliyorMu=text.toUpperCase().startsWith("M");
        System.out.println("M veya m ile basliyor mu= " + bununlaBasliyorMu);


        
        
        
        
        
        
    }
}
