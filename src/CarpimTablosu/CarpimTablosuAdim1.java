package CarpimTablosu;

public class CarpimTablosuAdim1 {
    public static void otherMethod() {

        /*
        5 x 0 = 0
        5 x 1 = 5
        5 x 2 = 10
        ....
        5 x 10 = 50
        */

        for(int i = 0; i <= 10; i = i + 1) {
            if(i == 0 || i == 1 || i == 2 || i == 10) {
                System.out.println("5 x " + i + " = " + 5 * i);
            } else if(i == 3){
                System.out.println("....");
            }
        }
    }
}
