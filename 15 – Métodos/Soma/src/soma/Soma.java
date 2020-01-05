
package soma;

public class Soma {
    
    // procedimento
    static void soma(int a, int b){
        int s = a+ b;
        System.out.println("A soma é: " + s);
    }
    
    // funcao
    static int diferenca(int a, int b){
        int dif = a - b;
        return dif;
    }
   
    public static void main(String[] args) {
        soma(5,2);
        
        int d = diferenca(10,2);
        System.out.println("A subtração entre 10 e 2 é: " + d);
    }
    
}
