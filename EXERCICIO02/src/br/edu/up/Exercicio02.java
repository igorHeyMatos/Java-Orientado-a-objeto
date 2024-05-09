
/*
Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
 */

package br.edu.up;

import java.util.Scanner;


public class Exercicio02 {
    
    public static void executar(){

        Scanner ler = new Scanner(System.in);
        Automovel objCombustivelgasto = new Automovel();

        System.out.println("Informe a distância percorrida(em km): ");
        double distancia = ler.nextDouble();
        objCombustivelgasto.setDistancia(distancia); 

        System.out.println("Informe o total de combustível gasto(em litros): ");
        double combGasto = ler.nextDouble();
        objCombustivelgasto.setCombGasto(combGasto);

        System.out.println("-----------------------------");
        System.out.printf("O consumo médio foi de: %.2f (Km / L)",objCombustivelgasto.resultado());

        ler.close();
    }
}
