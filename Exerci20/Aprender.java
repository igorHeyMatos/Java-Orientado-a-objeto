package Exerci20;

public class Aprender {
    public int nivelProf;
    public int horaAula;
    public float salarioFinal;

    float calculoSalario() {
        if (nivelProf == 1) {
            salarioFinal = 12 * horaAula;
        } else if (nivelProf == 2) {
            salarioFinal = 17 * horaAula;
        } else if (nivelProf == 3) {
            salarioFinal = 25 * horaAula;
        }
        return salarioFinal;
    }
}
