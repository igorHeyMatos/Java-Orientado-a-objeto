package Exerc01;

import java.util.Scanner;

public class Exercicio01 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        Aluno objAluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        objAluno.nome = leitor.nextLine();

        System.out.println("Digite a nota 1 do aluno: ");
        objAluno.nota1 = leitor.nextFloat();
        float notaUm = objAluno.nota1;

        System.out.println("Digite a nota 2 do aluno: ");
        objAluno.nota2 = leitor.nextFloat();
        float notaDois = objAluno.nota2;

        System.out.println("Digite a nota 3 do aluno: ");
        objAluno.nota3 = leitor.nextFloat();
        float notaTres = objAluno.nota3;

        float res = Aluno.media(notaUm, notaDois, notaTres);

        System.out.println("Nome: " + objAluno.nome);
        System.out.println("Nota 1: " + objAluno.nota1);
        System.out.println("Nota 2: " + objAluno.nota2);
        System.out.println("Nota 3: " + objAluno.nota3);
        System.out.println("Média: " + res);

        leitor.close();

    }
}
