package Veiculos;

public class CarroOffRoad extends Carro {
  private float pesoArrasto;

  public float getPesoArrasto() {
    return pesoArrasto;
  }

  public void setPesoArrasto(float pesoArrasto) {
    this.pesoArrasto = pesoArrasto;
  }

  @Override
  public void exibirInfo() {
    super.exibirInfo();
     String msg = String.format("Peso Arrasto: %d",
      pesoArrasto);
    System.out.println(msg);
  } 
}
