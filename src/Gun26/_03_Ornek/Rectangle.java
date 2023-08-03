package Gun26._03_Ornek;

public class Rectangle {

    // (properties, fields, özellik, eleman, items,attribute) : width(int), length(int)

    int width;
    int lenght;


    public void Cevre(){

        int cevre = 2 * (this.width * this.lenght) ;

        System.out.println("cevre = " + cevre);


    }

    public int Cevre2(){

        int cevre = 2 * (this.width * this.lenght) ;

      return  cevre;


    }

    public void Alan(){

        int alan = this.width * this.lenght ;
        System.out.println("alan = " + alan);


    }

    public int Alan2(){

        int alan = this.width * this.lenght ;
        return alan;


    }

    public  int degerAta(int width , int lenght){

       return  this.width * this.lenght ;
    }


}
