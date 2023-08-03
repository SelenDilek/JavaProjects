package Gun36._04_Interface;

public class A4 implements IYazdir,IGoster{
    @Override
    public void goster() {
        System.out.println("gosterdi");
    }

    @Override
    public void yazdir() {

        System.out.println("yazdirdi");
    }
}
