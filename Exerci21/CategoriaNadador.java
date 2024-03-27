package Exerci21;

public class CategoriaNadador {
    public int idade;
    public String categoria = "";

    String verificaIdade() {
        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A = 5 - 7 anos";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B = 8 - 10 anos";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A = 11 - 13 anos";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B = 14 - 17 anos";
        } else if (idade >= 18 && idade <= 25) {
            categoria = "Sênior = 18 - 25 anos";
        } else {
            categoria = "Idade fora da faixa etária!";
        }
        return categoria;
    }
}
