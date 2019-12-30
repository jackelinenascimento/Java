package resolucaodetela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDeTela {
    public static void main(String[] args) {
       Toolkit resolucao = Toolkit.getDefaultToolkit();
       Dimension tela = resolucao.getScreenSize();
        System.out.println("A resolução de tela é:");
        System.out.println(tela.height + " por " + tela.width);
    }   
}
