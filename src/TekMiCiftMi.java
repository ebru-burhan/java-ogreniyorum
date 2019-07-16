import java.util.Scanner;

public class TekMiCiftMi {
    public static void otherMethod() {
        Scanner girdiAlici = new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        int sayi = 0;
        sayi = girdiAlici.nextInt();

        if(sayi % 2 == 0) {
            System.out.println(sayi + " sayisi çift sayidir.");
        } else {
            System.out.println(sayi + " sayisi tek sayidir.");
        }
        /* KISA YOL
        System.out.println(sayi + " sayisi " + (sayi % 2 == 0 ? "çift" : "tek") + " sayidir.");
        */
    }
}
