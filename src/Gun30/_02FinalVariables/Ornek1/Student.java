package Gun30._02FinalVariables.Ornek1;

public class Student {
  final int id; //bu nesneye ait her yeni nesnede islem burdan baslar.classa ait degil.
    //burda id degismeyecek hic ilk degeri sabit kalacak. Hic bir yerde degeri degismez bir kez deger atanir
    String fullname ; //nesneye

   private static int sayac=1 ; //kime ait : class a


    public Student(int id, String fullname) {
        this.id = id;

        // final değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlanırken , ya da Constructor da
        this.fullname = fullname;
    }

    public Student(String fullname) {
        this.fullname = fullname;
        this.id=sayac++ ; //once islem sonra artis
        //id final oldugu icin constructer icinde bir deger atayip bitirdik her nesne icin.

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
