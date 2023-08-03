package Gun46;

public class S18 {
    public static void main(String[] args) {

        String [][] chs= new String[5][2]; //5 satir her satir iki eleman . asagida ilk iki tanesine atama yapmis digerleri yine iki elemanli oluyor
        chs[0] = new String[2]; //0,1
        chs[1] = new String[5];
        //digerini tanimlamasa da iki elemanli oldugunu bilecegiz.
        int i = 97;

        System.out.println("chs.lenght= " + chs.length); //5
        System.out.println("chs[0].lenght= " + chs[0].length); //4
        System.out.println("chs[1].lenght= " + chs[1].length); //5
        System.out.println("chs[2].lenght= " + chs[2].length); //2
        System.out.println("chs[3].lenght= " + chs[3].length); //2
        System.out.println("chs[4].lenght= " + chs[4].length); //2

        for (int a = 0; a < chs.length; a++) { //5 a:0,1,2,3,4
            for (int b = 0; b < chs.length; b++) { //5 b : 0,1,2,3,4 //burasi ilk satirin elemanini yazar ama 5e kada yazdiriyor ilk satir 4 e kadar
                chs[a][b]=" " +i; //burasi stringe cevirir. //b ancak 0 ve 1 olabilir
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
