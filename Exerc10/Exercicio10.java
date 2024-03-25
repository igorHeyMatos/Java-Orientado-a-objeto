package Exerc10;

import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        Pessoa objIdade = new Pessoa();

        System.out.println("Digite a quantidade de pessoas: ");
        objIdade.qtdPessoa = leitor.nextInt();

        objIdade.idade = new int[objIdade.qtdPessoa];

        for (int i = 0; i < objIdade.qtdPessoa; i++) {
            System.out.println("Digite a idade da pessoa: ");
            objIdade.idade[i] = leitor.nextInt();
        }

        System.out.println("<----------->");

        for (int c = 0; c < objIdade.qtdPessoa; c++) {
            System.out.println("Idade: " + objIdade.idade[c] + " | " + objIdade.verificaIdade(c));
        }

        leitor.close();
    }
}
