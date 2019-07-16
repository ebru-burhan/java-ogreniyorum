package Method;

public class MethodGiris {
    public static void harikaMethod(){
        int ilkSayi = 15;
        int ikinciSayi = 30;

        yazdir(ilkSayi);
        yazdir(ikinciSayi);
        int toplamSonucu = topla(ilkSayi, ikinciSayi);
        yazdir(toplamSonucu);
    }
    static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    static void yazdir(int sayi) {
        System.out.println("Gönderdiğin sayı: " + sayi);
    }

}