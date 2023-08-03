package Gun36._06_Interface;

public class Dikdortgen implements IGeometri{


    @Override
    public int cevresi(int kisaKenar , int uzunKenar) {
        return 2*kisaKenar*uzunKenar;
    }

    @Override
    public int alani(int kisaKenar , int uzunKenar) {
        return kisaKenar*uzunKenar;
    }
}
