package Method;

import java.util.Random;
import java.util.Scanner;

public class MethodSayiTahminOyun {

    public static void sayiTahminOyunuBaslat() {
        // 1-10 arasında bir sayı oluşturduk
        int aklimdakiSayi = rastgeleSayiOlustur(10) + 1;

        System.out.println("Selam! 1 ile 10 arasında bir sayı tuttum. Hadi bul.");

        // Kullanıcıdan sayıyı almak için Scanner tanımla
        Scanner girdiAlici = new Scanner(System.in);

        boolean oyunDevamEdiyor = true;
        while(oyunDevamEdiyor) {
            System.out.print("Sayi: ");
            int kullaniciTahmini = girdiAlici.nextInt();

            if(kullaniciTahmini > aklimdakiSayi) {
                System.out.println("Aklımdaki sayı tahmininden küçük.");
            } else if(kullaniciTahmini < aklimdakiSayi) {
                System.out.println("Aklımdaki sayı tahmininden büyük.");
            } else {
                System.out.println("BRAVOO! Tuttuğum sayıyı buldun.");
                oyunDevamEdiyor = false;
            }
        }
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

}
