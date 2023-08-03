package Gun47;

public class MyField {
    int x ; //this.x //default degeri=0
    int y; //this.y default degeri=0

    public void  doStuff(int x , int y){

        x=x; //classa bir etkisi var mi? yok. this.x degismedi=100
        y=this.y; //class da bir degisiklik var mi, yok, this.y classa ait bir deger. y parametreye gelen degere aittir.
        //this.y= y=0;
    }

    public void  doStuff2(int x,int y){

        this.x=x;
        this.y=y;
    }

    public void display(){

        System.out.println(x + " " + y + " : ");
    }

    public static void main(String[] args) {

        MyField m1 = new MyField(); //yeni bir nesne olustu mu?
        System.out.println("m1.x = " + m1.x);
        System.out.println("m1.y = " + m1.y);

        m1.x=100;
        m1.y=200;

        System.out.println("m1.x = " + m1.x);
        System.out.println("m1.y = " + m1.y);

        MyField m2 = new MyField(); //m2 nin x ve y si 0 dir
        m2.doStuff(m1.x , m1.y); //bunlarin degerleri gidiyor
        //bu islem herhangi bir deger degistirmez

        m1.display(); //100:200
        m2.display(); //0:0




    }
}

