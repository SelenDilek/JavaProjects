package Gun45;

public class S64_2 {
    public static void main(String[] args) {


        String[] arr={"A","B","C","D"};

        for(int i=0; i < arr.length ; i++){
            System.out.println(arr[i]+" ");

            if (arr[i].equals("C")){ //A yazar bu blok calismaz work done calisir sonra dongu aynen devam eder .)
                continue; // continue: pass gecıyordu hatırla !
            }

            System.out.println("Work Done");
        }


    }
}
// A Work Done B Work Done C D Work Done