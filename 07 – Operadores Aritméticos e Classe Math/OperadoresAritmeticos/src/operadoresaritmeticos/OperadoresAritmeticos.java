package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //operadores aritmeticos
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);
        
        //operadores unarios
        int numero = 5;
        numero++; //pos incremento
        System.out.println(numero);
        
        int valor = 5 + ++numero; //pre incremento
        System.out.println(valor);
    }
    
}
