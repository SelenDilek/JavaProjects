package Gun38._01_Abstract;

import Gun38._01_Abstract.BinekOto;

//nesne uretilecek olan class , tip
public class Ford extends BinekOto {


    public Ford(String marka, int uretimYili, int vitesAdi) {
        super(marka, uretimYili, vitesAdi);
    }

    @Override
    int hizlanmaSuresi() {
        return 0;
    }
}

//interface : yapilacaklar
//inheritance : bilgiler
//abstract(2i) : bilgi + yapilacaklar (ikisi bir arada inheritance+interface) (soyutlama)
