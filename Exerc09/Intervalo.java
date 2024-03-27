package Exerc09;

public class Intervalo {
    public int numero[] = new int[80];
    public int contador = 0;

    public int contVerifica() {
        for (int i = 0; i < 80; i++) {
            if (numero[i] >= 10 && numero[i] <= 150) {
                contador += 1;
            }
        }
        return contador;
    }

}
