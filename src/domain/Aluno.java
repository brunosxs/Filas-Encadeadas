package domain;

public class Aluno {
    private String nome, matricula;
    private float cr;
    private Aluno proximo;

    public Aluno(String nome, String matricula, float cr){
        this.nome = nome;
        this.matricula = matricula;
        this.cr = cr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    public Aluno getProximo() {
        return proximo;
    }

    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
    }
}
