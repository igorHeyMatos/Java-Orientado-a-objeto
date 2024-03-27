package Exerci25;

public class ClassificacaoAluno {
    public String nome;
    public String matricula;
    public float notaLab;
    public float notaAval;
    public float notaExam;
    public float notaFinal;
    public String situacao = "";

    float calculoMediaPond() {
        notaFinal = ((notaLab * 2) + (notaAval * 3) + (notaExam * 5)) / (2 + 3 + 5);
        return notaFinal;
    }

    String situacaoAluno() {
        if (notaFinal >= 8 && notaFinal <= 10) {
            situacao = "A";
        } else if (notaFinal >= 7 && notaFinal <= 8) {
            situacao = "B";
        } else if (notaFinal >= 6 && notaFinal <= 7) {
            situacao = "C";
        } else if (notaFinal >= 5 && notaFinal <= 6) {
            situacao = "D";
        } else if (notaFinal <= 5) {
            situacao = "R";
        }
        return situacao;
    }
}
