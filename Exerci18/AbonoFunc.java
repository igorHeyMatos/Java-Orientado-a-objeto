package Exerci18;

public class AbonoFunc {
    public String nome;
    public int idade;
    public String sexo = "";
    public float salarioFixo;
    public float salarioFinal;

    float salarioAbono() {
        if (sexo.equals("M") && idade >= 30) {
            salarioFinal = salarioFixo + 100;
        } else if (sexo.equals("M") && idade < 30) {
            salarioFinal = salarioFixo + 50;
        } else if (sexo.equals("F") && idade >= 30) {
            salarioFinal = salarioFixo + 200;
        } else if (sexo.equals("F") && idade < 30) {
            salarioFinal = salarioFixo + 80;
        }
        return salarioFinal;
    }
}
