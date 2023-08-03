package Gun04;

public class _07_Ornek3 {
    public static void main(String[] args) {
        //String olarak verilen 3 notun ("80" , "95" , "56" ) ort. bulunuz.
        String not1 = "82";
        String not2 = "95";
        String not3 = "56";

        String toplam = not1 + not2 + not3;
        System.out.println("toplam = " + toplam); // 829556

        int rakamNot1=Integer.parseInt(not1); //82
        int rakamNot2=Integer.parseInt(not2); //95
        int rakamNot3=Integer.parseInt(not3); //56

        int toplamNot=rakamNot1+rakamNot2+rakamNot3;
        System.out.println("toplamNot = " + toplamNot);

        double ort = toplamNot/(double)3;
        System.out.println("ort = " + ort);




        double ortalama = (Double.parseDouble(not1) + Double.parseDouble(not2) + Double.parseDouble(not3)) / 3;
        System.out.println("toplam = " + ortalama);


    }
}
