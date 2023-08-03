package Gun43;

import Tools.MyFunc;

public class _09_JavaCheckedveUncheckedException {
    public static void main(String[] args)  {
// Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.


        String kelime="";

        char ilkHarf= kelime.charAt(0); //hata verecek
        //Zorunlu degil , Unchecked Exception deniliyor.


        MyFunc.bekle(1000); //try catch e aldigimiz icin burda hata vermedi


        try {
            Thread.sleep(1000); //1 sn bekle , mecbur tutuyor. Hata olusturabilir try catch e almak lazim.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Checked Exception : try catch mecbur.

        //throws kullanirsak imza olarak yani try catch e almazsak hatanin kontrol altina alinmasini ertelemis oluruz. .
    }
}
