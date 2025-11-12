package Prova_2.Q2;

public class Conta {
  private double saldo = 100.00;
  
  public double getSaldo() {
    return saldo;
  }

  public void depositar(double valor){
    saldo += valor;
  }

  public void sacar(double valor){
    saldo -= valor;
  }
}
