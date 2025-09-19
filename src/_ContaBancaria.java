public class _ContaBancaria {
  
  private String titular;
  private String cpf;
  private float saldo = 0;

  public _ContaBancaria(String titular, String cpf){
    this.titular = titular;
    this.cpf = cpf;
  }

  public _ContaBancaria(String titular, String cpf, float saldoInicial){
    this.titular = titular;
    this.cpf = cpf;
    saldo = saldoInicial;
  }

  public void depositar(float valor){
    if (valor > 0) {
      saldo += valor;
      System.out.println(String.format("Depósito no valor de %.2f aprovado!", valor));
    } else {
      System.out.println("Depósito reprovado. Valor deve ser positivo!");
    }
  }

  public void sacar(float valor){
    if (valor > 0 && valor <= saldo) {
      saldo -= valor;
      System.out.println(String.format("Saque no valor de %.2f efetuado!", 
        valor, saldo));
    } else {
      if (valor < 0){
        System.out.println("O valor deve ser maior do que zero.");
      } else {
        System.out.println("Não há saldo suficiente!");
      }      
    }
  }

  public void exibeDadosConta(){
    String message = String.format("Titular da Conta: %s\nCPF do Titular: %s\nSaldo Atual: %.2f",
      titular, cpf, saldo);
    System.out.println(message);
  }

  public void mostraSaldo(){
    System.out.println(String.format("O saldo atual é: %.2f", saldo));
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public float getSaldo() {
    return saldo;
  }
  
}
