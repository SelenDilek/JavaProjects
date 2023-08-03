package Gun26._02_Ornek;

public class Person {

    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.

    String name ;
    String surname ;
    int age ;
//field , properties , ozellik



    public  void BilgiYazdir(){

        System.out.println("Adi = " + this.name);
        System.out.println("Soyadi = " + this.surname);
        System.out.println("Yasi = " + this.age);
    }

//yazdirilirken otomatik cagriliyor.
    public String toString(){

        return this.name + "\t" +this.surname +"\t"+ this.age;
    }


   // public String toString(){

  //      String yazilcakYazi= this.name + "\t" +this.surname +"\t"+ this.age;

  // return yazilcakYazi;
   // }


    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.


    public void getBirthYear(){

        System.out.println("Dogum Yili= "+ (2023-this.age));
    }


    public int getBirthYear2(){

        return  (2023-this.age);
    }
}


