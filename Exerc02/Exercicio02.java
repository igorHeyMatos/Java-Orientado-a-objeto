package Exerc02;

import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        Automovel objAutomovel = new Automovel();

        System.out.println("Digite a distância total percorrida: ");
        objAutomovel.distanciaTotal = leitor.nextFloat();

        System.out.println("Digite o total de combustível gasto: ");
        objAutomovel.combustivelGasto = leitor.nextFloat();

        System.out.println("Consumo médio: " + objAutomovel.media());

        leitor.close();

    }
}
