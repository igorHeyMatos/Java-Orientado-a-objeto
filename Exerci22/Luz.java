package Exerci22;

public class Luz {
    public int tipoCliente;
    public int kwHora;
    public float contaLuz;

    float calculoLuz() {
        if (tipoCliente == 1) {
            contaLuz = kwHora * 0.60f;
        } else if(tipoCliente == 2){
            contaLuz = kwHora * 0.48f;
        } else if(tipoCliente == 3){
            contaLuz = kwHora * 1.29f;
        }
        return contaLuz;
    }

}
