package Gun47;

import java.util.ArrayList;
import java.util.List;

public class S48 {
    public static void main(String[] args) {
        List colors = new ArrayList();

        colors.add("green"); //0. index
        colors.add("blue"); //1
        colors.add("red"); //2
        colors.add("yellow"); //3


        colors.remove(2); //indexe gore siler

        colors.add(3,"cyan"); //siradaki indexe ekleyebiliyor.

        //colors.add("cyan"); arada bosluk biraktigi icin hata verir

        //NOT: indexler sirayla doldurulur  0,1,2,3 index varsa 5. indexe ekleyemeyiz 4.indexe ekleyebiliriz,

        System.out.println("colors = " + colors);
    }
}
