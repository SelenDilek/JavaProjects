package Gun44;

public class S47 {
    public static void main(String[] args) {
        String[] strs={"A","B"};
        int idx=0;
        for(String s : strs)
            System.out.println(s);

        for(String s : strs){

            strs[idx].concat(" element" +idx); //burda esitleme olmamis strs[idx]=  strs[idx].concat(" element" +idx); olsaydi
            //index degisir ve cikisa A element 0B element 1 yazardi fakat cikti asagidaki gibi olacak ;
            idx++;
        }

        for(idx=0;idx<strs.length;idx++){

            System.out.println(strs[idx]); //CIKTI : AB
        }

    }
}
