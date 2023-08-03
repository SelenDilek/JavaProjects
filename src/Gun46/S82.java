package Gun46;

public class S82 {
    public static void main(String[] args) {
        String [][] chs= new String[2][0];  //2 satir belli , sutun sayisi belli degil
        chs[0] = new String[2]; //0. satir 2 elemanli 0,1
        chs[1] = new String[5]; //1.satir 5 elemanli 0,1,2,3,4
        int i = 97 ;


        for (int a = 0; a < chs.length; a++) {  //2 ye kadar gider 0,1 , sorun yok cunku lenght hepsinden uzun
            for (int b = 0; b < chs.length; b++) { //2 ye kadar gider , 0,1
                chs[a][b]=" " +i;
                i++;

            }

        }

        for(String[] ca : chs){
            for(String c : ca){

                System.out.println(c+ " ");
            }
            System.out.println();

        }


    }
}
