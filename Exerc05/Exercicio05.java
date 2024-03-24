package Exerc05;

import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Prestacoes objPrestacoes = new Prestacoes();

        System.out.printf("Digite o valor da compra: ");
        objPrestacoes.valorCompra = leitor.nextFloat();

        System.out.println("1x: " + objPrestacoes.valorCompra / 1);
        System.out.println("2x: " + objPrestacoes.valorCompra / 2);
        System.out.println("3x: " + objPrestacoes.valorCompra / 3);
        System.out.println("4x: " + objPrestacoes.valorCompra / 4);
        System.out.println("5x: " + objPrestacoes.valorCompra / 5);

        System.out.printf("Digite em quantas prestações: ");
        objPrestacoes.opcao = leitor.nextFloat();

        System.out.println("<-------------->");
        System.out.println("Valor total: " + objPrestacoes.valorPrestacao());

        leitor.close();
    }
}
