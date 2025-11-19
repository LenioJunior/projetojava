package Composicao.Pessoal;

public class Mecanico extends Funcionario{

  private int anosExperiencia;

  public Mecanico(String nome, float salario, int anosExperiencia) {
    super(nome, salario);
    this.anosExperiencia = anosExperiencia;
  }
  
}
