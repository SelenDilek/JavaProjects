package Gun06;

public class _07_StringLastIndexOf {
    public static void main(String[] args) {
        //indexOf : bastan itibaren arayip oda numarasini dondurur.
        //lastindexof : sondan itibaren aramaya baslar.
        //                        111
        //              0123456789012
        String cumle = "Merhaba Dunya";
        System.out.println("cumle.indexOf(a)= " + cumle.indexOf("a")); //4
        System.out.println("cumle.lastIndexOf(a)= " + cumle.lastIndexOf("a")); //12
        //index her zaman tektir , arama yonune gore degismez.
        System.out.println("cumle.lastIndexOf(a)= " + cumle.lastIndexOf("a",8)); //6
        //sondan gelerek aramaya 8 nolu odadan baslar fakat index sayimi her zaman soldan baslar.
        cumle = cumle.trim();
        //trim() basindaki ve sonundaki bosluklari siler

        System.out.println("cumle = " + cumle);








    }
}
