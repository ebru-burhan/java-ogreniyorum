package Dizi;

public class DiziBaslangic {
    public static void acayipBirMethod() {
        int a = 5;

        int[] sayiDizi = new int[5];
        sayiDizi[0] = 5;
        sayiDizi[1] = 10;
        sayiDizi[2] = 5;
        sayiDizi[3] = 15;
        sayiDizi[4] = 20;

        System.out.println(sayiDizi[4]);

        double[] ondalikDizi = new double[5];
        ondalikDizi[1] = 99.0;

        System.out.println(ondalikDizi[4]);

        String[] metinDizisi = new String[5];
        metinDizisi[2] = "ebru";

        System.out.println(metinDizisi[2].charAt(1));

        String adim = "ebru";
        System.out.println(adim.charAt(0));

        int[] sayilarinGucu = new int[7];
        sayilarinGucu[0] = 1;
        sayilarinGucu[1] = 3;
        sayilarinGucu[2] = 5;
        sayilarinGucu[3] = 7;
        sayilarinGucu[4] = 9;
        sayilarinGucu[5] = 11;
        sayilarinGucu[6] = 13;

        int ilkEleman = sayilarinGucu[0];
        int ikinciEleman = sayilarinGucu[1];

        int toplam = ilkEleman + ikinciEleman;
        System.out.println(toplam);

        for(int i = 0; i < sayilarinGucu.length; i = i + 1 ){
            System.out.println(sayilarinGucu[i]);
        }

        for(int i = 0; i < sayilarinGucu.length; i = i + 1 ){
            System.out.println(sayilarinGucu[i]);
        }

        /*
        sayilarinGucu[0] = 1;
        sayilarinGucu[1] = 3;
        sayilarinGucu[2] = 5;
        sayilarinGucu[3] = 7;
        sayilarinGucu[4] = 9;
        sayilarinGucu[5] = 11;
        sayilarinGucu[6] = 13;

         */
        int sayilarinGucununToplami = 0;


        for(int i = 0; i < sayilarinGucu.length; i = i + 1){
            sayilarinGucununToplami = sayilarinGucununToplami + sayilarinGucu[i];
        }
        System.out.println(sayilarinGucununToplami);

        int[] yenidizi = new int[5];
        for(int i = 0; i < yenidizi.length; i = i + 1) {
            yenidizi[i]= i * 5;
            System.out.println(yenidizi[i]);
        }
    }
}
