/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "Ana";
        float nota = 8.5f;
        System.out.println("A nota é " + nota); //print com quebra de linha
        System.out.printf("A nota de %s é %.2f \n", nome, nota); // print com formatação 
        System.out.format("Sua nota é %.2f \n", nota);
        
        System.out.print("Digite o nome do aluno: ");
        Scanner alunos = new Scanner(System.in);
        String nomeTodos = alunos.nextLine();
        System.out.print("Digite a nota do aluno: ");
        Scanner notas = new Scanner(System.in);
        float notasTodos = notas.nextFloat();
        System.out.printf("A nota de %s é %.2f \n", nomeTodos, notasTodos);
        
    }
    
}
