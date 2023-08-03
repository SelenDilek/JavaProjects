package Gun45;

public class S79 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};

        for(int i=0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");

            if (arr[i].equals("D")){
                System.out.print("Work Done");
                break; //break komutu icinde bulundugu donguyu kirar.
            }

            continue; //anlamsiz continue cunku altinda kod yok. Continue : hemen altindaki kodu calistirma demek pass gec demek.
        }
    }
}

// A B C D Work Done