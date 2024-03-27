package Exerci14;

public class Lucro {
    float[] precoCusto = new float[40];
    float[] precoVenda = new float[40];
    String resultado = "";
    float lucroTotal = 0;
    float custoTotal = 0;
    float precoTotal = 0;

    float mediaCusto() {
        for (int i = 0; i < precoCusto.length; i++) {
            custoTotal += precoCusto[i];
        }
        return custoTotal / precoCusto.length;
    }

    float mediaPreco() {
        for (int i = 0; i < precoVenda.length; i++) {
            precoTotal += precoVenda[i];
        }
        return precoTotal / precoVenda.length;
    }

    void calcularLucroTotal() {
        for (int i = 0; i < precoCusto.length; i++) {
            lucroTotal += precoVenda[i] - precoCusto[i];
        }
    }

    String resultadoFinal() {
        calcularLucroTotal();
        if (lucroTotal > 0) {
            resultado = "Lucro de: " + lucroTotal + " reais.\n";
        } else if (lucroTotal < 0) {
            resultado = "Prejuízo de: " + (-lucroTotal) + " reais.\n";
        } else {
            resultado = "Empate: " + lucroTotal + " reais.\n";
        }
        resultado += "Média de preço: " + mediaPreco() + "\n";
        resultado += "Média de custo: " + mediaCusto() + "\n";
        return resultado;
    }
}