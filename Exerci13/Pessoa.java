package Exerci13;

public class Pessoa {
    String nome[] = new String[5];
    String sexo[] = new String[5];
    int idade[] = new int[5];
    String saude[] = new String[5];
    String situacao = "";

    public String verifica(int index) {
        if (saude[index].equals("Apto") && sexo[index].equals("M") && idade[index] >= 18) {
            situacao = "Apto para cumprir o serviço obrigatório!";
        } else {
            situacao = "Não está apto para cumprir o serviço obrigatório!";
        }
        return situacao;
    }
}
