package Gun44;

public class S23 {
    public static void main(String[] args) {

        int [] stack = {10,20,30}; //indexler : 0,1,2,
        int size=3;
        int idx=0;

        //do {
       //     idx++;
       // }while (idx>=size); //1>=3 boyleyse don , sonuc idex=1

       // while (idx<size)
         //   idx++; //1,2,3, : sonuc idx=3 :HATA


       // do {
        //    idx++;
     //   }while (idx<=size); //idx=3 , sonuc=4 facia

        //while (idx<=size-1) //idx<=2
        //    idx++ ; //en son idx=3 olur , Exception



        do {
            idx++;
        }while (idx<size-1);

        System.out.println("idx= " + idx);
        System.out.println("The Top element=" + stack[idx]);




    }
}
