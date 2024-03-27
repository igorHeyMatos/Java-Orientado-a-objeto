package Exerci22;

import java.util.Scanner;

public class Exercicio22 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Luz objContaLuz = new Luz();

        System.out.println("Digite o tipo de cliente: ");
        objContaLuz.tipoCliente = leitor.nextInt();

        System.out.println("Digite a quantidade de horas: ");
        objContaLuz.kwHora = leitor.nextInt();

        System.out.println("Valor da conta: " + objContaLuz.calculoLuz() + " reais.");

        leitor.close();
    }
}
