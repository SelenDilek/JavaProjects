package Gun34._04_Protected._Paket1;

public class P1Hayvan {
    public String ad ; //her yerden, butun paketlerden ulasilabilir.
    int yas ; //default: sadece ayni paketten ulasilabilir
    protected  String cinsi; //default gibi , sadece bir yontem var
    private String renk; // sadece kendi bulundugu class dan erisim saglanabilir
}
