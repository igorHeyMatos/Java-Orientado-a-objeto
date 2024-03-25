package Exerc08;

public class AlunoMedia {
    public String nome;
    public float nota1;
    public float nota2;
    public float nota3;
    public String situacao = "";

    public float media() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    // public String situacaoAluno() {
    //     if (this.media() >= 7) {
    //         return this.situacao = "Aprovado";
    //     } else if (this.media() <= 5) {
    //         return this.situacao = "Reprovado";
    //     } else if (this.media() > 5 && this.media() < 7) {
    //         return this.situacao = "Recuperação";
    //     }
    // }
}
