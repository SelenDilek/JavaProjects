package Gun06;

public class _06_StringIndexOf {
    public static void main(String[] args) {
        //IndexOf : verilen karakterlerin veya karakterin insexini verir
        //01234 : harflerin oda numarasi
        //Bugun

        String cumle = "Merhaba Dunya";
        // h nin oda numarasi kac  : 3
        // a nin oda numarasi kac : herhangi bir sey belirtmemisse ilkini verir : 4 tur.
        //Du nin indexi kac : 8
        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); //0
        System.out.println("cumle.indexOf(h) = " + cumle.indexOf("h")); //3
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); //4
        System.out.println("cumle.indexOf(Du) = " + cumle.indexOf("Du"));//8
        System.out.println("cumle.indexOf(Du) = " + cumle.indexOf(" ")); //7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); //-1 gonderir yok manasinda
        System.out.println("cumle.indexOf(z) = " + cumle.indexOf("z")); //-1 gonderir yok manasinda

        //5 ve 5ten sonrasina bakar.
        System.out.println("cumle.indexOf(a,5) = " + cumle.indexOf("a" ,5));
        System.out.println("cumle.indexOf(a,7) = " + cumle.indexOf("a" ,7)); //son a yi bulur.


    }
}
