package Gun45;

public class S164 {
    public static void main(String[] args) {

        int data[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;

        for(int e: data)
        {
            if ( e!= key){ // 2014
                continue;
                //count++; // unreachable code: hiç çalışmayacak kod continue altina bir sey yazilmaz compile time error hatasi aliriz.
            }

           // System.out.println("data");
        }

        System.out.println(count+" Found");
    }
}
