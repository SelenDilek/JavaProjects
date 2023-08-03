package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        String bagis1 = "500";
        String bagis2="1500";
        //bana toplam bagis miktari lazim
        //disaridan veri string turunde geldi
        
        //int toplam=bagis1+bagis2 ;
        //bunlarin int e yani rakama donusmesi lazim
        
        int rakamBagis1 = Integer.parseInt(bagis1);
        int rakamBagis2=Integer.parseInt(bagis2);
        int toplam = rakamBagis1 + rakamBagis2 ;
        System.out.println("toplam = " + toplam);
        




    }
}
