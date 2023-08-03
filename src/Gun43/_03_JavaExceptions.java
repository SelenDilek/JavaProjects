package Gun43;

public class _03_JavaExceptions {
    public static void main(String[] args) {

        //Exception : beklenmeyen
        //expect:beklenen

        System.out.println("Program calismaya basladi");
        String kelime="";
        char harf=kelime.charAt(3); //3. karakter yok

        System.out.println("Program bitti");

        //Derleme zamani hatalari: program calisamadi : COMPILE ERROR , EXCEPTION
        // Program calismaya basladiktan sonra olusan hatalar var : RUNTIME ERROR,EXCEPTION

    }
}
