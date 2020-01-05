
package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        System.out.println("Quantas pernas?");
        int pernas = tec.nextInt();
        String tipo;
        System.out.println("Isso é uma...");
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET!!!";
        }
        System.out.println(tipo);
    }
    
}
