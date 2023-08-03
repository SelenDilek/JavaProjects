package Gun44;

public class S24 {
    public static void main(String[] args) {
        String[] strs = new String[2];
        int idx=0;
        strs[0]="";
        strs[1]="";

        for (int i = 0; i < strs.length ; i++) {
            System.out.println(strs[i]); //null,null yazdirir
        }
        //null oldugu icin ici bos boslukla deger birlestirilmez bir degeri yok bos null
        //null yazdirir fakat birlestirme yapamaz cunku degeri yok

        for(String s : strs){

            strs[idx]= strs[idx].concat(" element " +idx); //concat atamiyor esitleyip bir yere yazdirmasi lazim
            idx++;
        }

        for (idx=0;idx<=strs.length;idx++) {
            System.out.println(strs[idx]);
        }
    }
}
