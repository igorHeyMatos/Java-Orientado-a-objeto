package Exerc10;

public class Pessoa {
    public int qtdPessoa;
    public int idade[] = new int[qtdPessoa];
    public String msg = "";

    public String verificaIdade(int index) {
        if (idade[index] > 17) {
            msg = "Maior de idade!";
        } else if (idade[index] < 17) {
            msg = "Menor de idade!";
        }
        return msg;
    }
}
