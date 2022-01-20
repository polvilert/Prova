package VilertPolFuncions;

import java.util.Scanner;

public class Pvb {

    public static int llegirEnterAmbMissatge(String missatge) {
        int nombreLlegit = 0;
        boolean llegitNombre = false;

        Scanner teclat = new Scanner(System.in);
        do {
            try {
                llegitNombre = true;
                System.out.print(missatge);
                nombreLlegit = teclat.nextInt();
            } catch (Exception errorAGestionar) {
                System.out.print("ERROR! Només pots entrar nombres!");
                llegitNombre = false;
            } finally {
                teclat.nextLine();
            }
        } while (llegitNombre == false);
        teclat.close();
        return nombreLlegit;

    }

}
