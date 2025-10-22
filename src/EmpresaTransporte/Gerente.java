package EmpresaTransporte;

public class Gerente extends Funcionario {

  private double bonus;
  private double salarioBase;

  public Gerente(String nome, double salarioBase, double bonus) {
    super(nome, salarioBase);
    this.bonus = bonus;
  }

  @Override
  public void exibirInfo() {
    exibirInfoBase();
    String message = String.format("Bônus: %.2f\nSalário: %.2f", bonus, salarioBase);
    System.out.println(message);
  }

  @Override
  public double calcularSalario() {
    salarioBase = getSalarioBase() + bonus;
    return salarioBase;
  }

  public double getBonus() {
    return bonus;
  }
}
