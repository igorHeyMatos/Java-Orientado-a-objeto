package Exerci14;

import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        Lucro objLucro = new Lucro();
        for (int i = 0; i < 40; i++) {
            System.out.println("Digite o preco de custo: ");
            objLucro.precoCusto[i] = leitor.nextFloat();
            System.out.println("Digite o preço de venda: ");
            objLucro.precoVenda[i] = leitor.nextFloat();
        }
        System.out.println("<-------------->");
        System.out.println(objLucro.resultadoFinal());
        leitor.close();
    }
}