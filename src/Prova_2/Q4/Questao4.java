package Prova_2.Q4;

public class Questao4 {
  public static void main(String[] args) {
    Funcionario f = new Funcionario("João", 1000);
    System.out.println(String.format("Salário Inicial: %.2f", f.getSalario()));
    f.aumentarSalario(0.10);
    System.out.println(String.format("Salário Reajustado: %.2f", f.getSalario()));
  }
}
