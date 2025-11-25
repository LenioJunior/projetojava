package Composicao.Pessoal;

public abstract class Funcionario {
  private String nome;

  private float salario;

  public Funcionario(String nome, float salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public void listarBase(){
    System.out.println(String.format("Funcionário: %s. Salário: %.2f", nome, salario));
  }

  public abstract void listar();
}
