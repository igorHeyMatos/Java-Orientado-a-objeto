package Exerci26;

import java.util.Scanner;

public class Exercicio26 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Seguro objSeguro = new Seguro();

        do {
            System.out.println("Digite a idade: ");
            objSeguro.idade = leitor.nextInt();

            if (objSeguro.idade < 17 || objSeguro.idade > 70) {
                System.out.println("Esse tipo de informação não se enquadra!");
                break;
            }

            System.out.println("Digite o grupo de risco(em número): ");
            objSeguro.grupoRisco = leitor.nextInt();

            if (objSeguro.grupoRisco < 1 || objSeguro.grupoRisco > 9) {
                System.out.println("Esse tipo de informação não se enquadra!");
                break;
            }

            System.out.println("<----------------->");
            System.out.printf("Idade: ");
            System.out.println(objSeguro.verificaIdade());
            System.out.printf("Grupo de risco: ");
            System.out.println(objSeguro.verificaSeguro());
        } while (objSeguro.idade >= 17 && objSeguro.idade <= 70 && objSeguro.grupoRisco >= 1
                && objSeguro.grupoRisco <= 9);

        leitor.close();
    }
}
