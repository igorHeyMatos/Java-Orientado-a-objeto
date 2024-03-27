package Exerci25;

import java.util.Scanner;

public class Exercicio25 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        ClassificacaoAluno objAluno = new ClassificacaoAluno();

        System.out.println("Digite o nome do aluno: ");
        objAluno.nome = leitor.nextLine();

        System.out.println("Digite o número da matrícula: ");
        objAluno.matricula = leitor.nextLine();

        System.out.println("Digite a nota do laboratório (1 até 10): ");
        objAluno.notaLab = leitor.nextFloat();

        System.out.println("Digite a nota da avaliação semestral: ");
        objAluno.notaAval = leitor.nextFloat();

        System.out.println("Digite a nota do exame final: ");
        objAluno.notaExam = leitor.nextFloat();

        System.out.println("<------------------>");
        System.out.println("Nome: " + objAluno.nome);
        System.out.println("Matricula: " + objAluno.matricula);
        System.out.println("Nota final: " + objAluno.calculoMediaPond() + " | " + objAluno.situacaoAluno());

        leitor.close();
    }
}
