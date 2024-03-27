package Exerci19;

import java.util.Scanner;

public class Exercicio19 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Triangulo objTriangulo = new Triangulo();

        System.out.println("Digite o primeiro lado: ");
        objTriangulo.num1 = leitor.nextInt();

        System.out.println("Digite o segundo lado: ");
        objTriangulo.num2 = leitor.nextInt();

        System.out.println("Digite o terceiro lado: ");
        objTriangulo.num3 = leitor.nextInt();

        System.out.println(objTriangulo.verificaTipo());

        leitor.close();
    }
}
