package Exerci17;

public class ReajusteSalario {
    public String nome;
    public float salario;
    public float salarioMin;
    public float salarioAjustado;
    public String porcentoRea = "";
    public float folharPag;

    float calculoReajuste() {
        if (salario <= (salarioMin * 3)) {
            salarioAjustado = salario + (salario / 2);
            porcentoRea = "50%";
        } else if (salario > (salarioMin * 3) && salario <= (salarioMin * 10)) {
            salarioAjustado = salario + (salario / 5);
            porcentoRea = "20%";
        } else if (salario > (salarioMin * 10) && salario <= (salarioMin * 20)) {
            salarioAjustado = salario + ((salario * 15) / 100);
            porcentoRea = "15%";
        } else if (salario > salarioMin * 20) {
            salarioAjustado = salario + ((salario * 10) / 100);
            porcentoRea = "10%";
        }
        return salarioAjustado;
    }

    String retornaReajuste() {
        if (salario <= (salarioMin * 3)) {

            porcentoRea = "50%";
        } else if (salario > (salarioMin * 3) && salario <= (salarioMin * 10)) {

            porcentoRea = "20%";
        } else if (salario > (salarioMin * 10) && salario <= (salarioMin * 20)) {

            porcentoRea = "15%";
        } else if (salario > salarioMin * 20) {

            porcentoRea = "10%";
        }
        return porcentoRea;
    }

    float folhaPag() {
        folharPag = salarioAjustado - salario;
        return folharPag;
    }
}
