package Veiculos;

public abstract class Carro extends Veiculo {
  private int numeroDePortas;

  public int getNumeroDePortas() {
    return numeroDePortas;
  }

  public void setNumeroDePortas(int numeroDePortas) {
    this.numeroDePortas = numeroDePortas;
  }
  
  @Override
  public void exibirInfo(){
    exibirInfoVeiculo();
    System.out.println("Numero de Portas: " + numeroDePortas);
  }
}
