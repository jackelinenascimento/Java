
package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo"); // qdo declarado dessa forma, temos um objeto.
        String res;
        res = (nome1 == nome2)?"igual":"diferente";
        System.out.println(res);
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);
        //metodo equals => verifica conteudo
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        
    }
    
}
