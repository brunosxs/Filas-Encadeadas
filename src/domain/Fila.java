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
            fim = aluno;

        } else{
            System.out.println("\nA Fila já contem um ou mais alunos, inserindo aluno");
            fim.setProximo(aluno);
            fim = aluno;

        }
    }

    public void exibirAlunoInicio(){
        if (inicio == null) {
            System.out.println("Não há alunos na fila");
            return;
        }
        System.out.println("O aluno é: "+
                inicio.getNome() +
                " matrícula: " +
                inicio.getMatricula()+
                " com CR: " +
                inicio.getCr());
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

