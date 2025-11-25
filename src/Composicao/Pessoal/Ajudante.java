package Composicao.Pessoal;

public class Ajudante extends Funcionario {

  private String formacao;

  public Ajudante(String nome, float salario, String formacao) {
    super(nome, salario);
    this.formacao = formacao;
  }
  
  @Override
  public void listar(){
    super.listarBase();
    System.out.println(String.format("Formação: %s", formacao));
  }
}
