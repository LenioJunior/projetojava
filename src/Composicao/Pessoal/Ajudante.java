package Composicao.Pessoal;

public class Ajudante extends Funcionario {

  private String formacao;

  public Ajudante(String nome, float salario, String formacao) {
    super(nome, salario);
    this.formacao = formacao;
  }
  
}
