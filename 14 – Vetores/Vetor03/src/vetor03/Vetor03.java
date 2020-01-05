
package vetor03;

import java.util.Arrays;

public class Vetor03 {

    public static void main(String[] args) {
        // metodo for each para vetores
        
        double v[] = {3.5, 2.1, 4.4, 4.0, 0.6};
        
        for (double valor: v){
            System.out.print(valor + " ");
        }
        
        // colocando em ordem
        
        Arrays.sort(v);
        
        for (double valor: v){
            System.out.print(valor + " ");
        }
        
        // Busca binaria
        
        int pos = Arrays.binarySearch(v, 2);
        System.out.println(pos);
        
        // Preenchendo o vetor
        
        int numeros[] = new int[5];
        Arrays.fill(numeros, 0);
        
    }
    
}
