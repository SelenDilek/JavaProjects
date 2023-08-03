package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[][]tablo= new int[2][3];

        //karma tablo
        int[][] tablo2 ={
                {4,55}, // 0.satir 2 sutun
                {3,56,77}, // 1.satir 3 sutun
                {23,2,46,77,45,69,23,11}, // 2.satir 8 sutun
                {13,44,55}, // 3.satir 3 sutun
                {43}, // 4.satir 1 sutun

        };
        for (int i = 0; i < tablo2.length ; i++) {
            for (int j = 0; j <tablo2[i].length ; j++)
                System.out.print(tablo2[i][j]+" ");

            System.out.println();


        }






    }
}
