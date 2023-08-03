package Gun47;

class Student{
    String name;
    public Student(String name){

        this.name=name;


    }

    public Student(){


    }
}


public class Test_S103 {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        //hata name den dolayi degil students[0] hic olusturulmadi,yaratilmadi diye yazdirirken nullpoint hatasi verir
        //cunku olmayan bir seyi yazdiriyoruz java tanimiyor  bilmiyor. Dogmamis cocuga isim vermek gibi.
        //students[0] hic yaratilmadi olmayan bir sey.
        //NOTE : Baska class i bu sekilde de nesne uretebiliriz.
        students[1]=new Student("Richard");
        students[2]=new Student("Donald");

        for(Student s : students){

            System.out.println("" + s.name); //.name
        }

        //yukarisi ile bu kisim birbirinin aynisi
        Student ogr0;
        Student ogr1 = new Student("Ismet");
        Student ogr2 = new Student("Ayse");

    }
}
