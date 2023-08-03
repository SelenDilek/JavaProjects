package Gun30.StaticVariables.Ornek2;

public class Student {
   private int id=1; //bu nesneye ait her yeni nesnede islem burdan baslar.classa ait degil.
    String fullname ;

   private static int sayac=1 ; //sen bitanesin , classa ait.


    //sen bitanesin.
    // static olmadan herzaman 1 le başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.

    public Student(int id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public Student(String fullname) {
        this.fullname = fullname;
        this.id=sayac++ ; //once islem sonra artis

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
