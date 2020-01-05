
package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
        //operador ternario
        int n1, n2, r, s;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?0:1;
        System.out.println(r);
        s = (n1>n2)?n1-n2:n2-n1; // é possivel fazer operações na resposta
        System.out.println(s);
    }
    
}
