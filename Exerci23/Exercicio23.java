package Exerci23;

import java.util.Scanner;

public class Exercicio23 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        PesoIdeal objPesoIdeal = new PesoIdeal();

        System.out.println("Digite o nome: ");
        objPesoIdeal.nome = leitor.nextLine();

        System.out.println("Digite o sexo: ");
        objPesoIdeal.sexo = leitor.nextLine();

        System.out.println("Digite a altura: ");
        objPesoIdeal.altura = leitor.nextDouble();

        System.out.println("Digite a idade: ");
        objPesoIdeal.idade = leitor.nextInt();

        System.out.println("<------------>");
        System.out.println("Nome: " + objPesoIdeal.nome);
        System.out.println("Sexo: " + objPesoIdeal.sexo);
        System.out.println("Altura: " + objPesoIdeal.altura);
        System.out.println("Idade: " + objPesoIdeal.idade);
        System.out.println("Peso ideal: " + objPesoIdeal.calculoPesoIdeal());

        leitor.close();
    }
}
