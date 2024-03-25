package Exerc09;

import java.util.Scanner;


public class Exercicio09 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Intervalo objIntervalo = new Intervalo();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            objIntervalo.numero[i] = leitor.nextInt();
        }

        System.out.println("Quantidade de número dentro do intervalo: " + objIntervalo.contVerifica());

        leitor.close();
    }
}
