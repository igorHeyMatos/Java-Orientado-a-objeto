package Exerc03;

public class Vendedor{

    public String nome;
    public float salarioFixo;
    public float totalVendas;
    public float salarioFinal(){
        return (this.totalVendas / 15) + this.salarioFixo;
    }

}