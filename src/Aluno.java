  /* Demandas
    Atributos: Nome, Matricula, Integrado, Notas, Frequencia
    Métodos: lerNotas, lerFrequencia, calcularMedia, isAprovado, exibirStatus
  */

import java.util.Scanner;

public class Aluno {
  private String nome;
  private String matricula;
  private boolean integrado;
  private float notas[];
  private boolean frequencias[];
  private Scanner sc = new Scanner(System.in);

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public float calcularMedia(){
    float soma = 0;
    for (int i = 0; i < notas.length; i++) {
      soma += notas[i];
    }
    return soma / notas.length;
  }

  public float calcularFrequencia(){
    int contadorFrequencia = 0;
    for (int i = 0; i < frequencias.length; i++) {
      if(frequencias[i]){
        contadorFrequencia++;
      }
    }
    float percentualFrequencia = (float)(contadorFrequencia / frequencias.length);
    return percentualFrequencia;
  }

  public boolean isAprovado(){
    float media = calcularMedia();
    float percentualFrequencia = calcularFrequencia();
    return (media >= 6 && percentualFrequencia >= 0.75);
  }

  public void exibirStatus(){
    boolean isAprovado = isAprovado();
    float media = calcularMedia();
    float percentualFrequencia = calcularFrequencia();
    String status = "";

    if(isAprovado){
      status = "aprovado";
    } else {
      status = "reprovado";
    }

    status = isAprovado ? "aprovado" : "reprovado";

    System.out.println("O aluno está: " + status + ". Sua média é: " + media );
    System.out.println("Notas do aluno: ");
    for (int i = 0; i < notas.length; i++) {
      String msg = String.format("Nota %d: %f", (i + 1), notas[i]);
      System.out.println(msg);
    }

    System.out.println("Frequências do aluno: " + percentualFrequencia);
    for (int i = 0; i < frequencias.length; i++) {
      String msg = String.format("Frequência %d: %s", i + 1, frequencias[i] ? "S" : "N");
      System.out.println(msg);
    }
  }

  public void lerNotas(){
    System.out.println("Informar as notas do aluno!");
    notas = new float[3];
    for (int i = 0; i < notas.length; i++) {
      System.out.println("Informe a nota " + (i+1));
      notas[i] = sc.nextFloat();
    }
  }

  public void lerFrequencia(){
    System.out.println("Informar as frequências do aluno!");
    frequencias = new boolean[6];
    
    for (int i = 0; i < frequencias.length; i++) {
      System.out.println("Informe a frequência " + (i+1));
      frequencias[i] = sc.nextBoolean();
    }
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public boolean isIntegrado() {
    return integrado;
  }

  public void setIntegrado(boolean integrado) {
    this.integrado = integrado;
  }  

  public float[] getNotas() {
    return notas;
  }

  public boolean[] getFrequencia() {
    return frequencias;
  }
}
