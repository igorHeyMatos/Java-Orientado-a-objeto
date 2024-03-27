package Exerci16;

import java.util.Scanner;

public class Exercicio16 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Empresa objEmpresa = new Empresa();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o salário do funcionário: ");
            objEmpresa.salarioFunc[i] = leitor.nextFloat();
            System.out.println("Reajuste: + " + objEmpresa.reajuste(i));
            System.out.println("Salário reajustado: " + objEmpresa.salarioFinal[i]);
            System.out.println("<----------->");
        }

        leitor.close();
    }
}
