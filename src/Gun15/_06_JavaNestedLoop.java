package Gun15;

public class _06_JavaNestedLoop {
    public static void main(String[] args) {
// 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....

        // 5(dahil) lere kadar halini yapınız

        for(int kaclar=1 ; kaclar<=5 ; kaclar++){ //genel kac adet //satir
            for (int i=1 ; i<=10 ; i++) //ozel kac tane //satir islemleri
                System.out.println( kaclar+ "x" +i+"=" + (kaclar*i));

            System.out.println();




        }





    }
}
