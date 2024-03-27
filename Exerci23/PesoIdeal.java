package Exerci23;

public class PesoIdeal {
    public String nome;
    public String sexo;
    public double altura;
    public int idade;
    public double peso;

    double calculoPesoIdeal() {
        if (sexo.equals("M") && altura > 1.70 && idade <= 20) {
            peso = (72.7 * altura) - 58;
        } else if (sexo.equals("M") && altura > 1.70 && idade < 20 && idade < 40) {
            peso = (72.7 * altura) - 53;
        } else if (sexo.equals("M") && altura > 1.70 && idade >= 40) {
            peso = (72.7 * altura) - 45;
        } else if (sexo.equals("M") && altura <= 1.70 && idade <= 40) {
            peso = (72.7 * altura) - 50;
        } else if (sexo.equals("M") && altura <= 1.70 && idade > 40) {
            peso = (72.7 * altura) - 58;
        } else if(sexo.equals("F") && altura > 1.50 && idade < 35){
            peso = (62.1 * altura) - 44.7;
        } else if(sexo.equals("F") && altura <= 1.50 && idade >= 35){
            peso = (62.1 * altura) - 45;
        }else if(sexo.equals("F") && altura <= 1.50 && idade < 35){
            peso = (62.1 * altura) - 4;
        }
        return peso;
    }
}
