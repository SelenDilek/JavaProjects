package Gun38._02_Abstract;

public class GeometriMain {
    public static void main(String[] args) {

        Dikdortgen d = new Dikdortgen(3,4); //nesne yaratmak icin icinde somutlar olmali
        d.setName("Yeni Dikdortgen");
        d.ciz();
        System.out.println(d);

        System.out.println("-----------------------------");



        Daire dr = new Daire(4);
        dr.setName("Yeni Daire");
        dr.ciz();
        System.out.println(dr);


//Abstract ve interface onemli cunku ilerde projeye bir sey ekleyebilirsin ve classlarin hata vermemesi lazim bozulmamasi lazim.
        //birden cok implements bir tane extends
        //CONCRETE = SOMUT CLASS


    }
}
