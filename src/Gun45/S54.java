package Gun45;

public class S54 {
    public static void main(String[] args) {

        String[][] arr = {
                {"A", "B", "C"},
                {"D", "E"}
        };

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                if (arr[i][j].equals("B")) {
                    break; // içinde bulunduğu döngüyü kırar
                }
            }

            continue; //bu burda gereksiz kullanildi cunku kendinden sonra gelen ilk satiri pass gecer ama satir yok
        }

    }

}
// A B D E
