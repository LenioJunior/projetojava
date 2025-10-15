package Veiculos;

public abstract class Veiculo {

  protected String marca;
  protected String modelo;
  protected int ano;

  public void ligar(){
    System.out.println("O veículo está ligado!");
  }

  public void desligar(){
    System.out.println("O veículo foi desligado!");
  }

  public abstract void exibirInfo();

  protected void exibirInfoVeiculo(){
    String msg = String.format("Marca: %s\nModelo: %s\nAno: %d\n",
      marca, modelo, ano);
    System.out.println(msg);
  }

  // Carro → adicionar o atributo numeroDePortas
  // Moto → adicionar o atributo cilindradas

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
}
