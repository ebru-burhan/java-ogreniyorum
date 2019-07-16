import java.util.Scanner;

public class KullaniciGirdisiAlma_IfElse {
    public static void otherMethod() {
        System.out.println("Hello World!");
        Scanner girdiAlici = new Scanner(System.in);

        System.out.println("hazır mısın kanka sana salak salak sorular sorucam çünkü çok pis işler yapıyorum");

        String kullaniciGirdisi = girdiAlici.nextLine();

        if (kullaniciGirdisi.equalsIgnoreCase("sor gerizekalı")) {
            System.out.println("başlıyorum o zaman ");
            System.out.println("naber?");

            System.out.println(kullaniciGirdisi);
            String abc = "mahmut";
            kullaniciGirdisi = abc;
        } else if (kullaniciGirdisi.equalsIgnoreCase("sorma")) {
            System.out.println("kes lan");
        } else {
            System.out.println("aptal o kadar zeki değilim (sor gerizekalı) ya da (sorma) de");
        }
        //System.out.println("niye benim bu yazdığım else ile birleşik!");
    }
}
