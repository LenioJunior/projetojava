package EmpresaTransporte;

public class Motorista extends Funcionario {

  private int horasExtras;
  private double salario;

  public Motorista(String nome, float salarioBase, int horasExtras) {
    super(nome, salarioBase);

    this.horasExtras = horasExtras;
  }

  @Override
  public void exibirInfo() {
    exibirInfoBase();
    String message = String.format("Horas extras: %d\nSalário: %.2f", horasExtras, salario);
    System.out.println(message);
  }

  @Override
  public double calcularSalario() {
    /* Deve ser dado um adicional de 20% em cima das horas extras:
      salarioBase + (horasExtras * 1.2) */
      salario = getSalarioBase() + (horasExtras * 1.2);
      return salario;
  }

  public int getHorasExtras() {
    return horasExtras;
  }
}
