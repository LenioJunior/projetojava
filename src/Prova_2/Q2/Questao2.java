package Prova_2.Q2;

public class Questao2 {
  public static void main(String[] args) {
    Conta c = new Conta();
    c.depositar(50);
    c.sacar(30);
    System.out.println(c.getSaldo());
  }
}
