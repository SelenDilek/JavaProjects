package Gun07;

public class _04_StringIsEmpty {
    public static void main(String[] args) {
        //isEmpty: bir stringin icinde bir sey var mi yok mu boolean olarak verir.
        String s1 ="Merhaba";
        String s2= "" ;
        System.out.println("s1 bos mu = " + s1.isEmpty()); //false
        System.out.println("s2 bos mu = " + s2.isEmpty()); //true
        
        boolean bosMu = s2.isEmpty();
        System.out.println("bosMu = " + bosMu);

        
        
        
        
        
    }
}
