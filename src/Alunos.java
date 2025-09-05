import java.util.Scanner;

public class Alunos {

  private float notas[];
  private int frequencias[] = new int[6];
  private float media;
  private float percentualFrequencia;
  private Scanner sc = new Scanner(System.in);
  private float percentualFrequenciaAprovacao = 60;
  private float mediaAprovacao = 6;
  private int tamanhoPadrao = 5;

  public Alunos(int numNotas){
    notas = new float[numNotas];
  }

  public Alunos(){
    notas = new float[tamanhoPadrao];
  }

  private void lerNotas(){    
    for (int i = 0; i < notas.length; i++) {
        System.out.println("Informe a nota: " + (i + 1));
        notas[i] = sc.nextFloat();
    }
  }

  private void calcularMedia(){
    float soma = 0;        
    for(int i = 0; i < notas.length; i++){
        soma = soma + notas[i];
    }

    media = (float) soma / notas.length;  
  }

  private void lerFrequencias(){
    for(int i = 0; i < frequencias.length; i++){
        System.out.println(String.format("Informe a frequência %d.", (i + 1)));
        frequencias[i] = sc.nextInt();
    }
  }

  private void calcularPercentualFrequencia(){
    int contaPresenca = 0;
    for (int i = 0; i < frequencias.length; i++) {
        if(frequencias[i] == 1){
            contaPresenca++;
        }
    }
    percentualFrequencia = (float) contaPresenca / frequencias.length * 100;
  }

  private boolean isAprovado(){
    return percentualFrequencia >= percentualFrequenciaAprovacao && media >= mediaAprovacao;
  }

  private void exibeStatus(){

    System.out.println(String.format("Média: %.2f. Frequência: %.2f.", media, percentualFrequencia));
    for (int i = 0; i < notas.length; i++) {
        System.out.println(String.format("Sua nota %d: %.2f", (i + 1), notas[i]));
    }

    for (int i = 0; i < frequencias.length; i++) {
        String status = "";
        if(frequencias[i] == 1){
            status = "Presente";
        } else {
            status = "Ausente";
        }
        System.out.println(String.format("Sua frequência %d: %s", (i + 1), status));
    }   
  }

  public void fazTudo(){
    
    lerNotas();
    calcularMedia();
    lerFrequencias();
    calcularPercentualFrequencia();
   
    if(isAprovado()){
      System.out.println("Aprovado");
    } else {
      System.out.println("Reprovado");
    }

    exibeStatus();
     
  }
}
