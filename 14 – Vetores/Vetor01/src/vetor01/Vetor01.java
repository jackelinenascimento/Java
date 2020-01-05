
package vetor01;

public class Vetor01 {

    public static void main(String[] args) {
        int n[] = {3,2,8,7,5,4};
        
        for(int i=0; i<6; i++){
            System.out.println("Na posição " + i + " temos o valor: " + n[i]);
        }
        
        System.out.println("Total de casas do vetor é: " + n.length);
    }
    
}
