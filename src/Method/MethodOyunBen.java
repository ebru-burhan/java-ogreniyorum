package Method;

import java.util.Random;
import java.util.Scanner;

public class MethodOyunBen {

    public static int birSayiTut(int maksimum) {
        Random herhangiBiSayiTut = new Random();
        int herhangiBiSayi = herhangiBiSayiTut.nextInt();
        int pozitifSayi = 0;
        if(herhangiBiSayi < 0) {
            pozitifSayi = herhangiBiSayi * -1;
        } else {
            pozitifSayi = herhangiBiSayi;
        }

        int kucukSayi = pozitifSayi % maksimum;
        return kucukSayi;
    }

    public static void oyunuOyna() {
        int tuttugumSayi = birSayiTut(100 + 1);
        System.out.println("1 ile 100 arasında bir sayı tuttum hadi bul.");

        Scanner girdiAlici = new Scanner(System.in);

        boolean oyunaDevam = true;
        while(oyunaDevam == true) {
            System.out.print("Sayı giriniz ==> ");
            int girilenSayi = girdiAlici.nextInt();

            if(girilenSayi < tuttugumSayi) {
                System.out.println("Girdiğin sayı tuttuğum sayıdan küçük");
            } else if(girilenSayi > tuttugumSayi) {
                System.out.println("Girdiğin sayı tuttuğum sayıdan büyük");
            } else {
                System.out.println("Bravo! buldun hadi bi daha oynayalım. ");
                oyunaDevam = false;
            }
        }
    }
}

