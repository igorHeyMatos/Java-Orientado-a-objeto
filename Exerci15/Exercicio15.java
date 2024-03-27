package Exerci15;

import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Carango objCarango = new Carango();

        do {
            System.out.println("Digite o preço do carro: ");
            objCarango.precoCarro = leitor.nextFloat();

            if (objCarango.precoCarro == 0 || objCarango.precoCarro < 0) {
                break;
            }

            leitor.nextLine();

            System.out.println("Digite o tipo de combustível: ");
            objCarango.combustivel = leitor.nextLine();

            System.out.println("<----------->");
            System.out.println("" + objCarango.mostrarValores());
        } while (objCarango.precoCarro != 0 && objCarango.precoCarro > 0);

        leitor.close();
    }
}
