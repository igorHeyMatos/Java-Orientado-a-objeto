package Exerc07;

public class Carro {
    public float custoFabrica;
    public float distribuidor = 28;
    public float impostos = 45;
    public float precoFinal(){
        return custoFabrica + (custoFabrica / impostos) + (custoFabrica / distribuidor);
    }
}
