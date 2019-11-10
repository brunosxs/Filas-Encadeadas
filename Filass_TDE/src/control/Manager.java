package control;

import domain.Aluno;
import domain.Fila;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args){
        String nome, matricula;
        float cr;
        Scanner leia = new Scanner(System.in);
        String[] opcoes = new String[] { "InserirAlunos","Exibir Primeiro Aluno", "Remover Aluno", "Sair" };
        int resposta;
        Boolean continuar = true;
        Fila fila = new Fila();
        while(continuar){
            resposta = exibirOpcoes("Gerenciamento de Alunos", opcoes);
            switch (resposta){
                case 0: {
                    System.out.println("-------------Digite as informações de aluno---------");
                    System.out.println("\nNome: ");
                    nome = leia.next();
                    System.out.println("\nMatrícula: ");
                    matricula = leia.next();
                    System.out.println("\nCR: ");
                    cr = leia.nextFloat();

                    Aluno aluno = new Aluno(nome, matricula, cr);
                    fila.inserirAluno(aluno);
                    break;
                }
                case 1: {
                    System.out.println("\nExibinfo o Primeiro aluno: ");
                    fila.exibirAlunoInicio();
                    break;
                }
                case 2:{
                    fila.removerPrimeiroAluno();
                    break;
                }
                case 3: {
                    continuar = false;
                    break;
                }
            }

        }

    }

    public static int exibirOpcoes(String titulo, String[] opcoes){
        Scanner leia = new Scanner(System.in);
        System.out.println("-------------" + titulo + "----------------");
        System.out.println("\nEscolha uma Opção: ");
        for(int i = 0; i<opcoes.length; i++){
            System.out.println(i+"- "+opcoes[i]);
        }
        return leia.nextInt();
    }

}
