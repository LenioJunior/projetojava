package Aluno;
import java.util.Scanner;

public class AlunoProva {
  private String nome;
  private int matricula;
  private String curso;

  private double notas[];

  public AlunoProva(int quantidadeNotas){
    notas = new double[quantidadeNotas];
  }

// exibirResultado() → deve mostrar no console:
// Nome, matrícula e curso do aluno.
// Todas as notas lidas.
// A média calculada.
// Uma mensagem indicando “Aprovado” (média ≥ 6) ou “Reprovado” (média < 6).

  public void exibirResultado(){
    String message = String.format("Nome: %s\nCurso: %s\nMatricula: %d\n", 
      nome, curso, matricula);
    System.out.println(message);
    System.out.println("------ Notas ------");
    for (int i = 0; i < notas.length; i++) {
      System.out.println(String.format("Notas %d: %.2f", (i + 1), notas[i]));
    }
    double media = calcularMedia();
    System.out.println("A média obtida foi: " + media);

    if (media >= 6) {
      System.out.println("Aprovado");
    } else {
      System.out.println("Reprovado");
    }
  }

  public double calcularMedia(){
    double soma = 0;
    for(double nota : notas){
      soma += nota;
    }
    return (double)soma/notas.length;
  }

  public void lerNotas(){
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < notas.length; i++) {
      System.out.println("Informe a nota: " + (i + 1));
      notas[i] = scanner.nextDouble();
    }
    // notas[0] = scanner.nextDouble();
    // notas[1] = scanner.nextDouble();
    // notas[2] = scanner.nextDouble();
  }

  public double[] getNotas(){
    return notas;
  }


  public void setNotas(double[] notas){
    this.notas = notas;
  }



  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public int getMatricula(){
    return matricula;
  }

  public void setMatricula(int matricula){
    this.matricula = matricula;
  }

  public String getCurso(){
    return curso;
  }

  public void setCurso(String curso){
    this.curso = curso;
  }
}
