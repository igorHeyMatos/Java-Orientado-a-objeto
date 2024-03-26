package Exerci11;

import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Genero objGenero = new Genero();

        for (int i = 0; i < 56; i++) {
            System.out.println("Digite o nome: ");
            objGenero.nome[i] = leitor.nextLine();
            System.out.println("Digite o genero (M) ou (F): ");
            objGenero.sexo[i] = leitor.nextLine();
        }

        for (int c = 0; c < 56; c++) {
            objGenero.generoVerificaM(c);
            objGenero.generoVerificaF(c);
        }

        System.out.println("<---------------->");
        System.out.println("Quantidade masculino: " + objGenero.qtdHomem);
        System.out.println("Quantidade de mulher: " + objGenero.qtdMulher);

        leitor.close();
    }
}
