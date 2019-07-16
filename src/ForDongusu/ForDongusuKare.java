package ForDongusu;

public class ForDongusuKare {
    public static void baskaMethod() {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        int donguSayisi = 10;

        for(int i = 0; i < donguSayisi; i = i + 1 ){
            for(int j = 0; j < donguSayisi; j = j + 1){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
