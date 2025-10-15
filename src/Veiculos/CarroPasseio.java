package Veiculos;

public class CarroPasseio extends Carro{
  private int numeroCadeirasCrianca;

  public int getNumeroCadeirasCrianca() {
    return numeroCadeirasCrianca;
  }

  public void setNumeroCadeirasCrianca(int numeroCadeirasCrianca) {
    this.numeroCadeirasCrianca = numeroCadeirasCrianca;
  } 
  
    @Override
  public void exibirInfo() {
    super.exibirInfo();
     String msg = String.format("Num Cadeiras Criança: %d",
      marca, modelo, ano, numeroCadeirasCrianca);
    System.out.println(msg);
  } 
}
