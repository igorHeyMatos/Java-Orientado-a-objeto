package Exerci12;

import java.util.Scanner;

public class Exercicio12 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        CarangoVelho objCarangoVelho = new CarangoVelho();

        do {
            System.out.println("Digite o ano do carro: ");
            objCarangoVelho.anoVeic = leitor.nextInt();
            System.out.println("Digite o valor do carro: ");
            objCarangoVelho.valorDesconto = leitor.nextFloat();
            objCarangoVelho.desconto();
            System.out.println("Valor desconto: " + objCarangoVelho.valorCarro);
            System.out.println("Valor total: " + objCarangoVelho.valorFinal);
            leitor.nextLine();
            System.out.println("Deseja continuar (S) ou (N): ");
            objCarangoVelho.opcao = leitor.nextLine();
        } while (objCarangoVelho.opcao.equals("S"));
        System.out.println("Total carros: " + objCarangoVelho.totalCarro);
        System.out.println("Total carros até 2000: " + objCarangoVelho.cont2000);

        leitor.close();
    }
}
