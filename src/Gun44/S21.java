package Gun44;

public class S21 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4}; //index: 0,1,2,3, : arr.lenght =4

        int i=0;

        do {
            System.out.println(arr[i] + " "); // i: 0,1,2,3,hataolusur
            i++;
        }while (i<arr.length+1); //i<5 // HATA OLMAMASI ICIN +1 silinir.
    }
}

//Not : hata verir cunku i++ 4.indexe gelirse 4.index yok dizi 3 indexli 4 boyutlu. Lenght =4
//ArrayIndexOutOfBoundsException