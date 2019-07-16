public class HavaDurumuBoolean {
    public static void otherMethod() {
        boolean havaGunesli = true;
        boolean havaRuzgarli = true;
        boolean havaYagmurlu = false;

        if(havaGunesli == true && havaRuzgarli == false) {
            System.out.println("Denize gidelim!");
        } else if(havaYagmurlu == true || havaRuzgarli == true) {
            System.out.println("Uçuşlar iptal");
        } else {
            System.out.println("Otur evde");
        }
    }
}
