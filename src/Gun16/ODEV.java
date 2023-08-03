package Gun16;

public class ODEV {
    public static void main(String[] args) {

        //// TODO : gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
        //        // TODO : fakat bir buldunu tekrar bulmasın

        String tvleri [] = {"atv" , "fox" , "kanal d" , " TV8" , "startv"};


        int rndIndexi = (int) (Math.random() * (tvleri.length));

        System.out.println("Kanal adi= " + tvleri[rndIndexi]);

        System.out.println();


         {for (int i = 0; i < tvleri.length ; i++)
            if(tvleri[i] != tvleri[rndIndexi]){

                System.out.println("Kanal adi= " + tvleri[i]);


                System.out.println();
            }


        }


    }
}
