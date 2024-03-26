package Exerci11;

public class Genero {
    String nome[] = new String[56];
    String sexo[] = new String[56];
    int qtdHomem = 0;
    int qtdMulher = 0;

    int generoVerificaM(int index) {
        if (this.sexo[index].equals("M")) {
            qtdHomem += 1;
        }
        return qtdHomem;
    }

    int generoVerificaF(int index) {
        if (this.sexo[index].equals("F")) {
            qtdMulher += 1;
        }
        return qtdMulher;
    }
}
