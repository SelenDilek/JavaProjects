package Tekrar;

public class _07_Soru {
    public static void main(String[] args) {
        // Soru: 3 ders 5 öğrenci için notları kullanıcıdan
        // aldıktan sonra, bir metodda ortalamayı yazdırınız.
        // diğer bir metodda ortalamayı geçen sayısını bulunuz.

        int[][] notlar=new int[3][5]; // 3 satir,5 sütundan 15 sayı

        notlar[0][0]=60;
        notlar[0][1]=70;
        notlar[0][2]=80;
        notlar[0][3]=90;
        notlar[0][4]=60;

        notlar[1][0]=60;
        notlar[1][1]=70;
        notlar[1][2]=85;
        notlar[1][3]=95;
        notlar[1][4]=65;

        notlar[2][0]=60;
        notlar[2][1]=73;
        notlar[2][2]=84;
        notlar[2][3]=95;
        notlar[2][4]=66;

        double ort=ortalamaYaz(notlar);
        gecenSayisiniYaz(notlar, ort);

        // okunabilirliği artırmak
        // kontrolü elimize alıyoruz.
        // 1 kere yaz herzaman kullan
    }

    public static double ortalamaYaz(int[][] notlar){

        double toplam=0;
        for (int satir = 0; satir < notlar.length; satir++) {
            for (int sutun = 0; sutun < notlar[satir].length; sutun++) {
                toplam=toplam+ notlar[satir][sutun];
            }
        }

        double ort=toplam/ (notlar.length * notlar[0].length);

        System.out.println("ort = " + ort);

        return ort;
    }

    public static void gecenSayisiniYaz(int[][] notlar, double ort){
        int gecenSayisi=0;

        for (int satir = 0; satir < notlar.length; satir++) {
            for (int sutun = 0; sutun < notlar[satir].length; sutun++) {
                if ( notlar[satir][sutun] >= ort)
                    gecenSayisi++;
            }
        }

        System.out.println("gecenSayisi = " + gecenSayisi);
    }

}
