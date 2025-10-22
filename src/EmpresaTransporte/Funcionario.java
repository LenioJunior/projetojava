package EmpresaTransporte;

public abstract class Funcionario {

  private String nome;
  private double salarioBase;

  public Funcionario(String nome, double salarioBase) {
    this.nome = nome;
    this.salarioBase = salarioBase;
  }

  protected void exibirInfoBase(){
    String msg = String.format("Nome: %s\nSalário Base: %.2f", nome, salarioBase);
    System.out.println(msg);
  }

  public abstract void exibirInfo();

  public abstract double calcularSalario();


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalarioBase() {
    return salarioBase;
  }
}
