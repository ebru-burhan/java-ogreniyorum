import java.util.Scanner;

public class WhileDongusu {
    public static void otherMethod() {
        boolean uygulamaCalissinMi = true;
        while (uygulamaCalissinMi == true) {
            Scanner girdiAlici = new Scanner(System.in);
            System.out.println("Sayı giriniz.");
            int sayi = 0;
            sayi = girdiAlici.nextInt();

            if(sayi == -99) {
                uygulamaCalissinMi = false;
            } else {
                if(sayi % 2 == 0) {
                    System.out.println(sayi + " sayisi çift sayidir.");
                } else {
                    System.out.println(sayi + " sayisi tek sayidir.");
                }
            }
        }
    }
}
