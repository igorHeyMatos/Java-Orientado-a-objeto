package Exerc03;

import java.util.Scanner;

public class Exercicio03 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        Vendedor objVendedor = new Vendedor();

        System.out.printf("Digite o nome do vendedor: ");
        objVendedor.nome = leitor.nextLine();

        System.out.printf("Digite o salário fixo do vendedor: ");
        objVendedor.salarioFixo = leitor.nextFloat();

        System.out.printf("Digite o total em vendas efetuadas por ele: ");
        objVendedor.totalVendas = leitor.nextFloat();

        System.out.println("<-------------->");
        System.out.println("Nome vendedor: " + objVendedor.nome);
        System.out.println("Salário fixo: " + objVendedor.salarioFixo);
        System.out.println("Salário final do mês: " + objVendedor.salarioFinal());

        leitor.close();

    }
}
