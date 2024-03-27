package Exerci24;

import java.util.Scanner;

public class Exercicio24 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        MediaPonderada objMediaPonderada = new MediaPonderada();

        System.out.println("Digite a nota do exame do laboratório (1 até 10): ");
        objMediaPonderada.notaLab = leitor.nextFloat();

        System.out.println("Digite a nota da avaliação semestral (1 até 10): ");
        objMediaPonderada.notaAval = leitor.nextFloat();

        System.out.println("Digite a nota do exame final (1 até 10): ");
        objMediaPonderada.notaExam = leitor.nextFloat();

        System.out.println("Nota final: " + objMediaPonderada.calculoMediaPond());

        leitor.close();
    }
}
