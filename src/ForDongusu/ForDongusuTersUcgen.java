package ForDongusu;

public class ForDongusuTersUcgen {
    public static void baskaBirMethod() {
        for(int i = 3; i > 0; i = i - 1) {
            for(int j = i; j > 0; j = j - 1) {
                System.out.print(" | i = " + i + ", j = " + j + " | ");
            }
            System.out.println();
        }
    }
}
