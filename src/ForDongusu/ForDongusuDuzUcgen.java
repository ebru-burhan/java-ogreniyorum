package ForDongusu;

public class ForDongusuDuzUcgen {
    public static void otherMethod() {
        for(int i = 1; i <= 3; i = i + 1){
            for(int j = 1; j < i; j = j + 1){
                System.out.print(i);
            }
            System.out.println(i);
        }
    }
}
