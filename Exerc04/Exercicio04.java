package Exerc04;

import java.util.Scanner;

public class Exercicio04 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Conversao objConversao = new Conversao();

        System.out.printf("Digite a cotação do dólar: ");
        objConversao.cotacaoDolar = leitor.nextFloat();

        System.out.printf("Digite a quantidade de dólares que você tem disponível: ");
        objConversao.dolarDisp = leitor.nextFloat();

        System.out.println("<-------------------->");
        System.out.println("Valor em real: " + objConversao.valorReal());

        leitor.close();
    }
}
