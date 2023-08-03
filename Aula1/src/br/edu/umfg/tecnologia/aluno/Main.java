package br.edu.umfg.tecnologia.aluno;

import java.util.Scanner;

public class Main extends  Aluno{
    public static void main(String[] args){

        Scanner ponto = new Scanner(System.in);
        double notaProva, notaTrabalho, media;
        String ra,nome;

        System.out.println("Seja Bem Vindo a verificação de media!!!");
        System.out.println("Para iniciarmos insira as informações com forme pedido abaixo ");
        System.out.println();
        System.out.println("Insira Primeiro o Nome :");
        nome = ponto.next();
        System.out.println("Insira o RA(Registro Academico) :");
        ra= ponto.next();
        System.out.println("Insira a Nota Total de Trabalho :");
        notaTrabalho= ponto.nextDouble();
        System.out.println("Insira a Nota da Prova :");
        notaProva= ponto.nextDouble();
        Aluno usuario = new Aluno(nome,ra,notaProva,notaTrabalho);

        System.out.println("RESULTADO :");
        usuario.RESULTADO();

    }


}
