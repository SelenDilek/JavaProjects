package Gun31._02_Soru;

public class User {

    String usurname ;

    Role role ;
    Status statu;

    public static void userSil(User user){

        if(user.role == Role.ADMIN){

            System.out.println("Admin silinemez");
        }

        else {
            System.out.println("User silindi");
        }
    }



    public User(String usurname, Role role, Status statu) {
        this.usurname = usurname;
        this.role = role;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "usurname='" + usurname + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
