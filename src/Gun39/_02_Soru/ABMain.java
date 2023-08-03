package Gun39._02_Soru;

public class ABMain {
    public static void main(String[] args) {
        
        A a = new A();
        System.out.println("a.mesaj = " + a.mesaj); //A
        
        B b = new B();//CONSTRUCTER calisti.B class b nesne. nesneye aittir.
        System.out.println("b.mesaj = " + b.mesaj);//B
        
        A a2 = new A(); //olusan nesneye aittir.
        System.out.println("a2.mesaj = " + a2.mesaj);//A 
        a2.mesaj="sadece mesaj";
        System.out.println("a2.mesaj = " + a2.mesaj);
    }
}
