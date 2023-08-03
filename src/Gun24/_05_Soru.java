package Gun24;

import java.util.*;

public class _05_Soru {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış
        public static void main(String[] args) {

            Scanner strOku = new Scanner(System.in);
            Scanner intOku = new Scanner(System.in);
            Map<String ,String> sozluk = new TreeMap<>();
            int secim ;



            do {
                _05_Soru.Menu();
                System.out.print("Lutfen secim yapiniz= ");
                secim = intOku.nextInt();
                switch (secim){

                    case 1 :
                        System.out.print("Lutfen kelime giriniz");
                        String kelime =strOku.nextLine();
                        System.out.print("Lutfen anlamini giriniz");
                        String anlami =strOku.nextLine();
                        sozluk.put(kelime,anlami);
                        if(sozluk.containsKey(kelime) && sozluk.containsValue(anlami))
                        {System.out.println("Kelime ve anlami basari ile eklendi.");}
                        break;

                    case 2 :

                        System.out.print("Duzeltilecek kelimeyi giriniz=");
                        String yeniKelime = strOku.nextLine();
                        if(sozluk.containsKey(yeniKelime)){
                            System.out.print("Manasini duzeltiniz= ");
                            String yeniAnlam= strOku.nextLine();
                            sozluk.put(yeniKelime,yeniAnlam); //tekrar put yapip ayni kelimeyi yazarsak guncelleme yapmis oluruz.
                        }
                        else
                       System.out.println("Kelime bulanamamaktadir.");
                        Menu();
                        System.out.print("Tekrar secim yapiniz= ");
                        secim = intOku.nextInt();

                        break;
                    case 3 :
                        System.out.println("\n*** SOZLUK LISTENIZ ***");
                        for(Map.Entry<String,String> kv : sozluk.entrySet()){

                            System.out.println(kv.getKey() + " - " + kv.getValue());
                        }

                        break;
                    case 4 :
                        System.out.print("Aranacak kelimeyi giriniz=");
                        String aranacakKelime = strOku.nextLine();
                        if(sozluk.containsKey(aranacakKelime)){

                            System.out.println("Aranan kelime= " +  sozluk.get(aranacakKelime)); //get ile kelimeyi getiririz yazdiririz.


                        }
                            else
                    { System.out.println("Kelime bulanamamaktadir");
                        Menu();
                        System.out.print("Tekrar secim yapiniz= ");
                        secim = intOku.nextInt();}

                        break;
                    case 5 :

                        System.out.print("Silinecek kelimeyi giriniz= ");
                        String silinecekKelime = strOku.nextLine();
                        sozluk.remove(silinecekKelime);
                        for(Map.Entry<String,String> kkvv : sozluk.entrySet())
                            System.out.println(kkvv.getKey() + "-" + kkvv.getValue());

                        break;
                    case 6 :
                        System.out.println("Cikis yaptiniz");
                        break;
                    default:
                        System.out.println("HATALI GIRIS YAPTINIZ!");
                    { System.out.println("Kelime bulanamamaktadir");
                        Menu();
                        System.out.print("Tekrar secim yapiniz= ");
                        secim = intOku.nextInt();}

                }


            }while (secim<6);


        }

        public static void Menu(){
            System.out.print("1.EKLEME"+"\n"+"2.DUZELTME"+"\n"+"3.LISTELEME"+"\n"+"4.ARAMA"+"\n"+"5.SILME"+"\n"+"6.CIKIS"+"\n");
            System.out.println("CANLI SOZLUGE HOSGELDINIZ");

        }
}