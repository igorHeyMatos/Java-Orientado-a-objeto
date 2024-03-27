package Exerci18;

import java.util.Scanner;

public class Exercicio18 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        AbonoFunc objFunc = new AbonoFunc();

        System.out.println("Digite o nome do funcionário: ");
        objFunc.nome = leitor.nextLine();

        System.out.println("Digite a idade: ");
        objFunc.idade = leitor.nextInt();

        leitor.nextLine();

        System.out.println("Digite o sexo: ");
        objFunc.sexo = leitor.nextLine();

        System.out.println("Digite o salário: ");
        objFunc.salarioFixo = leitor.nextFloat();

        System.out.println("<------------>");

        System.out.println("Nome: " + objFunc.nome);
        System.out.println("idade: " + objFunc.idade);
        System.out.println("Sexo: " + objFunc.sexo);
        System.out.println("Salário líquido: " + objFunc.salarioAbono());

        leitor.close();
    }
}
