package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesiWhileFull {
    public static void otherMethod() {

        boolean prog = true;
        while(prog == true){
            Scanner girdiAlici = new Scanner(System.in);
            System.out.println("ilk sayiyi giriniz.");
            int ilkSayi = girdiAlici.nextInt();

            System.out.println("ikinci sayiyi giriniz.");
            int ikinciSayi = girdiAlici.nextInt();

            System.out.println("operatoru giriniz.");
            String operator = girdiAlici.next();

            int sonuc = 0;
            boolean hataVarMi = false;

            if(operator.equalsIgnoreCase("+")) {
                sonuc = ilkSayi + ikinciSayi;

            } else if(operator.equalsIgnoreCase("-")) {
                sonuc = ilkSayi - ikinciSayi;

            } else if(operator.equalsIgnoreCase("*")) {
                sonuc = ilkSayi * ikinciSayi;

            } else if(operator.equalsIgnoreCase("/")) {
                if(ikinciSayi == 0) {
                    System.out.println("ikinci sayiya bolme isleminde 0 yazilamaz aptal misin");
                    hataVarMi = true;

                } else {
                    sonuc = ilkSayi / ikinciSayi;

                }
            }
            else if(operator.equalsIgnoreCase("?")){
                prog = false;

            }
            else {
                System.out.println("yalnizca + , - , * , / operatorlerini kullanabilirsiniz.");
                hataVarMi = true;
            }

            if(hataVarMi == false && prog == true) {
                System.out.println("sonuc: " + sonuc);
            }
        }
    }
}
