package Gun30._02FinalVariables.Ornek1;

public class School {
    public static void main(String[] args) {
      Student ogr1 = new Student(1,"Selen Dilek");
      Student ogr2 = new Student(2,"Mehmet Yilmaz");
      Student ogr3 = new Student(3,"Beyza Demir");
      //Problem: hem id yi takip etmek zorundayim hem de hata olasiligi yuksek

        Student ogr10 = new Student("Selen");
        Student ogr11 = new Student("Mehmet");
        Student ogr12 = new Student("Ayse");

        System.out.println("ogr10 = " + ogr10); //1
        System.out.println("ogr11 = " + ogr11); //2
        System.out.println("ogr12 = " + ogr12); //3

        //ogr10.id=5005;
        //Student.sayac=5005;

      //ogr10.id=5000;
      // final değişkenlerine sadece 1 kez veri atanabilir.
      // o da ya tanımlanırken , ya da Constructor da



    }
}
