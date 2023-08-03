package Gun12;

public class _01_JavaRandom {
    public static void main(String[] args) {
        
        double randSayi = Math.random();
        System.out.println("randSayi = " + randSayi);
        //0-0,999999999
        //10la carparsam
        //0-9,9999999 arasi
        //(int) yazarsak basina 0-9 arasi rakamlar kalmis olur.
        
        int randTamSayi = (int)(randSayi*11); //10 u dahil edecegiz
        System.out.println("randTamSayi = " + randTamSayi);
        
        
        
        
        
    }
}
