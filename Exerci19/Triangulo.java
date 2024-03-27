package Exerci19;

public class Triangulo {
    public int num1;
    public int num2;
    public int num3;
    public String tipoTriangulo = "";

    String verificaTipo() {
        if (num1 == num2 && num1 == num3) {
            tipoTriangulo = "Triângulo Equilátero!";
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            tipoTriangulo = "Triângulo Equilátero e Isóscele!";
        } else {
            tipoTriangulo = "Triângulo Escaleno!";
        }
        return tipoTriangulo;
    }
}
