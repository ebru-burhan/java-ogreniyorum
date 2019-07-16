package Method;

public class Method2 {
    public static void sikikMethod(){
        int ilkSayi = 15;
        int ikinciSayi = 30;

        int toplam = topla(ilkSayi, ikinciSayi);
        toplam = toplam + 5;
        System.out.println(toplam);

        yazdir(ilkSayi, ikinciSayi);

        yazdir(99, 55);

        yazdir(213, 123);
    }
    // f(x) = x + 5
    static int f(int x) {
        return x + 5;
    }
    static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    static void yazdir(int sayi1, int sayi2) {
        System.out.println(sayi1 + " + " + sayi2 + " = " + topla(sayi1, sayi2));
    }
}
