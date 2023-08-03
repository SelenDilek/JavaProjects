package Gun44;

public class S29 {
    public static void main(String[] args) {

        int a [] = {1,2,3,4,5}; //1,3,5 yazilmasi isteniyor
        //indexler 0,2,4 olmali

        for (int e = 0; e <5 ; e+=2) {
            System.out.print(a[e]);

        }

        //2 ve 4 yazmasi icin
        for (int e = 1; e <5 ; e++) {
            System.out.print(a[e]);

        }
    }
}
