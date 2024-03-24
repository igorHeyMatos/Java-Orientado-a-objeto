package Exerc02;

public class Automovel {
    public float distanciaTotal;
    public float combustivelGasto;

    public float media(){
        return (this.distanciaTotal/ this.combustivelGasto);
    }
}
