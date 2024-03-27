package Exerci17;

import java.util.Scanner;

public class Exercicio17 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        ReajusteSalario objFuncionario = new ReajusteSalario();

        System.out.println("Digite o nome do funcionario: ");
        objFuncionario.nome = leitor.nextLine();

        System.out.println("Digite o salário: ");
        objFuncionario.salario = leitor.nextFloat();

        System.out.println("Digite o valor do salário minimo: ");
        objFuncionario.salarioMin = leitor.nextFloat();

        System.out.println("<--------->");

        System.out.println("Nome: " + objFuncionario.nome);
        System.out.println("Reajuste de: " + objFuncionario.retornaReajuste());
        System.out.println("Novo salário: " + objFuncionario.calculoReajuste());
        System.out.println("Folha de pagamento: " + objFuncionario.folhaPag());

        leitor.close();
    }
}
