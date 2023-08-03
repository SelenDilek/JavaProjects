package Gun28._02_Ornek;

public class Kitap {

    String name ;
    int publishYear ;
    String author ;

    public Kitap() {
        System.out.println("Kitap bilgileri : ");
    }
    public Kitap(String name, int publishYear, String author) {
        System.out.println("Kitap bilgileri : ");
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;

    }
    public Kitap(String name, int publishYear) {

        //System.out.println("Kitap adi ve yayinlanma yili");

        this(name,publishYear,""); //bu da bir method Kitap() yazmak yerine this yazdik.
    }



    public Kitap(String name, String author) {

        System.out.println("Kitap adi ve yazari : ");
        this.name = name;

        this.author = author;

        //this(name,author,0);
    }




    public void  Yazdir(){

        System.out.println("Book name = " + this.name);
        System.out.println("Author name = " + this.author);
        System.out.println("Publish Year = " + this.publishYear);


    }

    public  String toString(){

        return this.name + " " + this.author + " " + this.publishYear ;
    }

}
