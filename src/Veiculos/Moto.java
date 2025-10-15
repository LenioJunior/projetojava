package Veiculos;

public class Moto extends Veiculo {
  private int cilindradas;

  public int getCilindradas() {
    return cilindradas;
  }

  public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
  }

  public float calcularPotencia(){
    ligar();
    return ano * cilindradas;
  }

  @Override
  public void exibirInfo() {
    exibirInfoVeiculo();
    String msg = String.format("Cilindradas: %d",
      marca, modelo, ano, cilindradas);
    System.out.println(msg);
  }  
}
