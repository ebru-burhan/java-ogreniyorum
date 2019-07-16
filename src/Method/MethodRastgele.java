package Method;

import java.util.Random;

public class MethodRastgele {
    public static void someMethod(String[] args) {
        int[] dizi;
        dizi = elemanDoldur(5);
        diziYazdir(dizi);
    }

    public static int rastgeleSayiOlustur(int maksimum) {
        Random rastgeleOlusturucu = new Random();
        int rastgeleSayi = rastgeleOlusturucu.nextInt();

        int pozitifSayi = 0;
        if(rastgeleSayi < 0) {
            pozitifSayi = rastgeleSayi * -1;
        } else {
            pozitifSayi = rastgeleSayi;
        }

        int pozitifKucukSayi = 0;
        pozitifKucukSayi = pozitifSayi % maksimum;

        return pozitifKucukSayi;
    }

    // TODO: Parametre olarak bir eleman sayısı al
    // Bir dizi yarat ve rastgele elemanlarla doldur
    // Doldurduğun bu diziyi geri döndür
    public static int[] elemanDoldur(int elemanSayisi) {
        int[] dizi = new int[elemanSayisi];
        for (int i = 0; i < dizi.length; i = i + 1) {
            dizi[i] = rastgeleSayiOlustur(10);
        }
        return dizi;
    }

    // TODO: Parametre olarak bir dizi al
    // Aldığın dizinin elemanlarını sırayla yazdır
    public static void diziYazdir(int[] dizi) {
        for(int i = 0; i < dizi.length; i = i + 1 ){
            System.out.println(dizi[i]);
        }
    }
}