package ForDongusu;

import java.util.Scanner;

public class ForDongusuIciBosKare {
    public static void someMethod() {
        // 1- İçi boş kare çizdiriniz.
        /*
         * * * * * *
         *         *
         *         *
         *         *
         *         *
         * * * * * *
         */
        Scanner girdiAlici = new Scanner(System.in);
        System.out.println("döngü sayısı giriniz.");

        int donguSayisi = girdiAlici.nextInt();
        if(donguSayisi < 3) {
            System.out.println("3'ten büyük sayı giriniz.");
        } else{
            for(int i = 0; i < donguSayisi; i = i + 1) {
                for(int j = 0; j < donguSayisi; j = j + 1) {
                    if(j == 0 || j == donguSayisi - 1 || i == 0 || i == donguSayisi - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
