package Gun29._02_PrivateErisim;

public class Calisan {
    int id ; //default erisim  (diger paketlerden erisemeyiz)
    String name ; //default erisim
    String surname ; //default erisim
   private String password ; //default erisim

   public void sifreAta(String sifre){
       if(sifre.length() <8){
           System.out.println("Zayif sifre");
       }
       else {
           this.password = sifre;
           System.out.println("Sifre basari ile atandi");
       }
    }


    public void sifreGoster(){

        System.out.println("****"+ this.password.substring(4));
    }

}
