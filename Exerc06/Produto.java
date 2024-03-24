package Exerc06;

public class Produto {
    public float precoCusto;
    public float acrescimo;
    public float valorVenda(){
        return precoCusto + (precoCusto / acrescimo);
    }
}
