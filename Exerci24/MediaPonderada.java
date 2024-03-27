package Exerci24;

public class MediaPonderada {
    public float notaLab;
    public float notaAval;
    public float notaExam;
    public float notaFinal;

    float calculoMediaPond() {
        notaFinal = ((notaLab * 2) + (notaAval * 3) + (notaExam * 5)) / (2 + 3 + 5);
        return notaFinal;
    }
}
