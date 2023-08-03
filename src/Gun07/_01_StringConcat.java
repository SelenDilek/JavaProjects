package Gun07;

public class _01_StringConcat {
    public static void main(String[] args) {
        //concat: bir stringi digerine birlestiriyor. Biz daha once + ile birlestirme yapmistik.
        String s1 = "Merhaba";
        String s2 = "Dunya";
        System.out.println("Birlesik hali=" + s1+s2);
        System.out.println("Birlesik hali=" + s1.concat(s2));
        System.out.println("Birlesik hali=" + s1.concat("").concat(s2));
        System.out.println("Birlesik hali=" + s1.concat(" " + s2));

        System.out.println("s1="+s1); //s1 in degeri degismedi
        System.out.println("s2="+s2);//s2 in degeri degismedi

        s1=s1.concat(s2); //s1 in degeri bir seyi s1e atayinca degisir.
        System.out.println("s1=" +s1);
        
        //NOT : 
        
        int a = 44 ;
        String b ;
        
        b=Integer.toString(a);
        System.out.println("b = " + b);

        //Ikinci Yol
        
        int sayi = 44 ;
        String sayi2 = sayi + "as";
        System.out.println("sayi2 = " + sayi2);
        
        







    }
}
