package CarpimTablosu;

public class CarpimTablosuFull {
    public static void otherMethod() {
        /*
        i x j = i * j
        */
        for(int j = 0; j <= 10; j = j + 1){

            if(j % 2 == 0) {
                System.out.println("==============================");
                for(int i = 0; i <= 10; i = i + 1) {
                    System.out.println(j + " x " + i + " = " + j * i);
                }
                System.out.println("==============================");

            }
        }
    }
}
