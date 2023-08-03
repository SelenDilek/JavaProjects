package Gun07;

public class _09_StringEndsWith {
    public static void main(String[] args) {
        String text = "Merhaba Dunya";
        System.out.println("text.endsWith(ya)) = " + text.endsWith("ya")); //true
        System.out.println("text.endsWith(n)) = " + text.endsWith("n")); //false
        System.out.println("text.endsWith(A)) = " + text.endsWith("A")); //false
        System.out.println("text.endsWith(Dunya)) = " + text.endsWith("Dunya")); //true
    }
}
