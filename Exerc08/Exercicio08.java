package Exerc08;

import java.util.Scanner;

public class Exercicio08 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        AlunoMedia objAlunoMedia = new AlunoMedia();

        System.out.println("Digite o nome do aluno: ");
        objAlunoMedia.nome = leitor.nextLine();

        System.out.println("Digite a nota 1: ");
        objAlunoMedia.nota1 = leitor.nextFloat();

        System.out.println("Digite a nota 2: ");
        objAlunoMedia.nota2 = leitor.nextFloat();

        System.out.println("Digite a nota 3: ");
        objAlunoMedia.nota3 = leitor.nextFloat();

        System.out.println("<-------------->");
        System.out.println("Resultado: " + objAlunoMedia.media());
        // System.out.println(" " + objAlunoMedia.situacaoAluno());
        if (objAlunoMedia.media() >= 7) {
            System.out.println("Aprovado!");
        } else if (objAlunoMedia.media() <= 5) {
            System.out.println("Reprovado!");
        } else if (objAlunoMedia.media() > 5 && objAlunoMedia.media() < 7) {
            System.out.println("Recuperação!");
        }

        leitor.close();
    }
}
