package Gun08;

public class _02_StringReplaceFirst {
    public static void main(String[] args) {
        //replaceFirst: bir string icerisindeki karakter(leri) verilenlerle degisir faakt sadece ilkini,

        String text = "Merhaba Dunya";
        System.out.println("text = " + text);

        System.out.println("text.replaceFirst(a,e)="+ text.replaceFirst("a","e"));
        System.out.println("text.replaceFirst(ba,de)="+ text.replaceFirst("ba","de"));
        //birinciyi bulup degistirir.
        System.out.println("text.replaceFirst(Dunya,Java)="+ text.replaceFirst("Dunya","Java"));
        System.out.println("text.replaceFirst(a,'')="+ text.replaceFirst("a",""));








    }
}
