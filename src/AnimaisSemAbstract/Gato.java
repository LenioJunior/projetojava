package AnimaisSemAbstract;

public class Gato extends Animal {

  @Override
  public void emitirSom() {
    System.out.println("Miau");
  }

  @Override
  public float calcularMassaCorporal() {
    throw new UnsupportedOperationException("Unimplemented method 'calcularMassaCorporal'");
  }

  @Override
  public void locomover() {
    throw new UnsupportedOperationException("Unimplemented method 'locomover'");
  }

  @Override
  public String obterPedigree() {
    throw new UnsupportedOperationException("Unimplemented method 'obterPedigree'");
  }
}
