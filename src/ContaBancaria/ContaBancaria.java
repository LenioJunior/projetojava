/*
 * Crie uma classe chamada ContaBancaria com os seguintes atributos privados:
titular (String)    cpf (String)    saldo (double)

Crie os métodos getters e setters para cada atributo. Lembrando que o saldo deve ter apenas getter.
Crie um método depositar() que recebe um valor a ser depositado.
Validar se o valor a ser depositado é maior do que zero.
Crie um método sacar() que recebe um valor a ser sacado e que retorna o valor sacado.
Validar se há saldo suficiente para efetuar o saque.
Crie um construtor para a classe, que receba os parâmetros titular, cpf e saldoInicial.
 */

public class ContaBancaria {
  private String titular;
  private String cpf;
  private double saldo;

  public ContaBancaria(String titular, String cpf){
    this.titular = titular;
    this.cpf = cpf;
  }

  public boolean depositar(double valor){
    if(valor > 0){
      saldo += valor;
      return true;
    }
    return false;
  }

  public boolean sacar(double valor){
    if(valor > 0 && valor <= saldo){
      saldo -= valor;
      return true;
    }
    return false;
  }

  public void trocarTitularidade(String titular, String cpf){
    // Validações
    this.titular = titular;
    this.cpf = cpf;
  }

  public String getTitular() {
    return titular;
  }

  public String getCpf() {
    return cpf;
  }

  public double getSaldo() {
    return saldo;
  }
}
