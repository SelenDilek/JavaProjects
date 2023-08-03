package Gun31._03_Enum;

public enum Aylar {

    Tanimsiz(0,0,"") ,
    OCAK(1,31,"Ocak") ,
    SUBAT(2,28,"Subat") ,
    MART(3,31,"Mart") ,
    NISAN(4,30,"Nisan") ,
    MAYIS(5,31,"Mayis") ,
    HAZIRAN(6,30,"Haziran"),
    TEMMUZ(7,31,"Temmuz") ,
    AGUSTOS (8,31,"Agustos"),
    EYLUL(9,31,"Eylul") ,
    EKIM (10,30,"Ekim"),
    KASIM(11,30,"Kasim") ,
    ARALIK(12,31,"Aralik");

   final int ayNo;
   final int gunMiktar;
   final String ayAd;

    Aylar(int ayNo, int gunMiktar, String ayAd) {

        this.ayNo=ayNo;
        this.gunMiktar=gunMiktar;
        this.ayAd=ayAd;
    }
}
