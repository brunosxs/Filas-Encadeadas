package control;

import domain.Aluno;
import domain.Fila;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args){
        boolean rodouUmaVez = false;
        String nome, matricula;
        float cr;
        Scanner leia = new Scanner(System.in);
        String[] opcoes = new String[] { "InserirAlunos","Exibir Primeiro Aluno", "Remover Aluno", "Sair" };
        int resposta;
        Boolean continuar = true;
        Fila fila = new Fila();
        while(continuar){
            nome = null;
            matricula = null;
            cr = 0;
            resposta = exibirOpcoes("Gerenciamento de Alunos", opcoes);
            // Bug no scanner que,no caso de capturar ints não interpreta o símbolo de newline dado pelo enter, isso
            // escapa para o próximo momento em que usamos qualquer um dos métodos next... do scanner
//            if (rodouUmaVez) {
//                leia.nextLine();
//            }
            switch (resposta){
                case 0: {
                    System.out.println("-------------Digite as informações de aluno---------");
                    System.out.println("\nNome: ");
                    try{
                        nome = leia.nextLine();
                        System.out.println("\nMatrícula: ");
                        matricula = leia.nextLine();
                        System.out.println("\nCR: ");
                        try {
                            cr = Float.parseFloat(leia.nextLine());
                        } catch(Exception e)  {
                            System.out.println("Invalid value");
                        }

                        Aluno aluno = new Aluno(nome, matricula, cr);
                        fila.inserirAluno(aluno);
                    } catch(Exception e) {
                        System.out.println("Parâmetros inválidos");

                    }
                    break;
                }
                case 1: {
                    System.out.println("\nExibindo o Primeiro aluno: ");
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
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        }

    }

    public static int exibirOpcoes(String titulo, String[] opcoes){
        Scanner leia = new Scanner(System.in);
        int valor;
        System.out.println("-------------" + titulo + "----------------");
        System.out.println("\nEscolha uma Opção: ");
        for(int i = 0; i<opcoes.length; i++){
            System.out.println(i+"- "+opcoes[i]);
        }
        try{
            valor = Integer.parseInt(leia.nextLine());
        } catch (Exception e) {
            valor = -1;

        }
        return valor;
    }

}
