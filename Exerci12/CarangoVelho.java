package Exerci12;

public class CarangoVelho {
    int qtdCarro;
    float valorDesconto;
    float valorCarro = 0;
    float valorFinal = 0;
    int anoVeic;
    String opcao = "";
    int cont2000 = 0;
    int totalCarro = 0;

    float desconto() {
        if (anoVeic > 2000) {
            valorCarro = valorDesconto * 0.07f;
            valorFinal = valorDesconto - valorCarro;
        } else if (anoVeic <= 2000) {
            valorCarro = valorDesconto * 0.12f;
            valorFinal = valorDesconto - valorCarro;
            cont2000 += 1;
        }
        totalCarro += 1;
        return valorCarro;
    }

}
