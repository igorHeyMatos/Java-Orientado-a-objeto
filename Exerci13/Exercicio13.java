package Exerci13;

import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Pessoa objPessoa = new Pessoa();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome: ");
            objPessoa.nome[i] = leitor.nextLine();
            System.out.println("Digite o sexo (F) ou (M):");
            objPessoa.sexo[i] = leitor.nextLine();
            System.out.println("Digite a idade: ");
            objPessoa.idade[i] = leitor.nextInt();
            leitor.nextLine();
            System.out.println("Digite sobre a saúde (Apto) ou (Não apto): ");
            objPessoa.saude[i] = leitor.nextLine();
            System.out.println("" + objPessoa.verifica(i));
        }

        leitor.close();
    }
}
