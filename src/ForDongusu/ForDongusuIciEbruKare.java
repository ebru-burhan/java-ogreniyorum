package ForDongusu;

public class ForDongusuIciEbruKare {
       public static void benimMetodum(){
        // 2- İçi boş kare çizdiriniz ve tam ortasına bir metin yazınız.
        /*
         * * * * * *
         *         *
         *   ebru  *
         *         *
         *         *
         * * * * * *
         */
        for(int i = 0; i < 6; i = i + 1 ){
            for(int j = 0; j < 6; j = j + 1 ) {

                if(i == 0 || i == 5 || j == 0 || j == 5){
                    System.out.print(" * ");
                }else if(i == 1  || i == 3 || i == 4 ){
                    System.out.print("   ");

                }  else if (i == 2 && j == 1 ){
                    System.out.print(" e ");
                } else if (i == 2 && j == 2){
                    System.out.print(" b ");
                } else if(i == 2 && j == 3){
                    System.out.print(" r ");
                } else if (i == 2 && j ==4){
                    System.out.print(" u ");
                }
            }

            System.out.println();
        }
    }

}
