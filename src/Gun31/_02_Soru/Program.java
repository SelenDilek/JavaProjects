package Gun31._02_Soru;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Selen" , Role.ADMIN , Status.AKTIF);
        User user2 = new User("Ahmet" , Role.SATIS , Status.PASIF);
        User user3 = new User("Ayse" , Role.MUDUR , Status.AKTIF);

        User.userSil(user1); //Admin silinemez
        User.userSil(user2); // user silindi
        User.userSil(user3); // user silindi

        //if(user1.role==Ryole.ADMIN){
        //
        // //kullanici silme islemleri}
    }



}
