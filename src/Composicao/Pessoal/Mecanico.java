package Composicao.Pessoal;

public class Mecanico extends Funcionario{

  private int anosExperiencia;

  public Mecanico(String nome, float salario, int anosExperiencia) {
    super(nome, salario);
    this.anosExperiencia = anosExperiencia;
  }
  
  @Override
  public void listar(){
    super.listarBase();
    System.out.println(String.format("Anos Experiência: %d", anosExperiencia));
  }
}
