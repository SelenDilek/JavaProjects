package Gun03;

//05.24.2023

public class _04_DataTypesMinMax {
    public static void main(String[] args) {
        //Degerlerin araliklarini sinirlarini sistemden gorebilmek icin Buyk harf ile baslatilir.
        System.out.println("ByteMaxDegeri :" + Byte.MAX_VALUE); //127
        System.out.println("ByteMinDegeri :  " + Byte.MIN_VALUE); //-128

        System.out.println("shortMaxDeger : " + Short.MAX_VALUE); //32767
        System.out.println("shortMinDeger : " + Short.MIN_VALUE); //-32768

        System.out.println("intMinDegeri : " + Integer.MIN_VALUE); // -2147483648
        System.out.println("intMaxDegeri : " + Integer.MAX_VALUE); //2147483647

        System.out.println("longMinDeger : " + Long.MIN_VALUE); //-9223372036854775808
        System.out.println("longMaxDeger : "+ Long.MAX_VALUE); // 9223372036854775807

        System.out.println("doubleMinDeger : " + Double.MIN_VALUE); //4.9E-324
        System.out.println("doubleMaxDeger : " + Double.MAX_VALUE); //1.7976931348623157E308

        System.out.println("floatMinDegeri: " + Float.MIN_VALUE);//1.4E-45
        System.out.println("floatMaxDegeri : " + Float.MAX_VALUE);//3.4028235E38

        //String ve char larin degerleri yok sayisal olarak ne atarsak onu yaziyor zaten :)





    }
}
