package Exerci20;

import java.util.Scanner;

public class Exercicio20 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Aprender objProfessor = new Aprender();

        System.out.println("Digite o nível do professor: ");
        objProfessor.nivelProf = leitor.nextInt();

        System.out.println("Digite a quantidade de horas aula: ");
        objProfessor.horaAula = leitor.nextInt();

        System.out.println("Salário professor: " + objProfessor.calculoSalario());

        leitor.close();
    }
}
