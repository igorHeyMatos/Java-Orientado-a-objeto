package Exerc06;

import java.util.Scanner;

public class Exercicio06 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Produto objProduto = new Produto();

        System.out.println("Digite o custo do produto: ");
        objProduto.precoCusto = leitor.nextFloat();

        System.out.println("Digite o acréscimo: ");
        objProduto.acrescimo = leitor.nextFloat();

        System.out.println("<------------------>");

        System.out.println("Valor de venda: " + objProduto.valorVenda());

        leitor.close();
    }
}
