package Exerci15;

public class Carango {
    public float precoCarro;
    public float desconto;
    public float valorPago;
    public String combustivel = "";
    public String resultado = "";

    void calculoDesconto() {
        if (combustivel.equals("A")) {
            desconto = precoCarro * 0.25f;
        } else if (combustivel.equals("G")) {
            desconto = precoCarro * 0.21f;
        } else if (combustivel.equals("D")) {
            desconto = precoCarro * 0.14f;
        }
        valorPago = precoCarro - desconto;
    }

    String mostrarValores() {
        calculoDesconto();
        System.out.println("Total desconto: " + desconto);
        System.out.println("Total pago: " + valorPago);
        return resultado;
    }
}
