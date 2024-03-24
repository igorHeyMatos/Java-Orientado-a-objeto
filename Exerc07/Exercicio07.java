package Exerc07;

import java.util.Scanner;

public class Exercicio07 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Carro objCarro = new Carro();

        System.out.println("Digite o custo de fábrica: ");
        objCarro.custoFabrica = leitor.nextFloat();

        System.out.println("Preço final: " + objCarro.precoFinal());

        leitor.close();
    }
}
