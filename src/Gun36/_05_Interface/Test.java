package Gun36._05_Interface;

import Gun36._04_Interface.IGoster;


public class Test implements IGoster, IYazdirir {
    @Override
    public void goster() {

        System.out.println("gosterdi");

    }

    @Override
    public void yazdir(String msg) {
        System.out.println(msg+"yazdirildi");
    }

    @Override
    public void yaz() { //iki tane yaz methodu var almadi.Birini aldi ortak olani.

        System.out.println("yazdirildi");
    }

    @Override
    public int yazdirmaSayisiGoster() {
        int sayfaSayisi=5; //method calisti
        return sayfaSayisi;
    }
}
