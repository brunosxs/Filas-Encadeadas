package domain;

public class Fila {
    private Aluno inicio, fim;

    public Fila(){
        this.inicio = null;
        this.fim = null;
    }

    public void inserirAluno(Aluno aluno){
        if(inicio == null && fim == null){
            System.out.println("\nFila vazia, inserindo o primeiro aluno");
            inicio = aluno;

        }else if(inicio != null && fim == null){
            System.out.println("\nA Fila já contém um aluno, inserindo o primeiro aluno");
            inicio.setProximo(aluno);
            fim = aluno;

        }else{
            System.out.println("\nA Fila já contem mais de um aluno, inserindo o primeiro aluno");
            fim.setProximo(aluno);
            fim = aluno;

        }
    }

    public void exibirAlunoInicio(){
        System.out.println("\nAluno no início: " + inicio.getNome());
    }

    public void removerPrimeiroAluno(){
        System.out.println("\n-------------Remoção de Aluno----------");
        if(inicio == null){
            System.out.println("Não é possível excluir, a fila está vazia");
        }else {
            System.out.println("Removendo o aluno: " + inicio.getNome());
            inicio = inicio.getProximo();
        }
    }

}

