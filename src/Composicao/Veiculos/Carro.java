package Composicao.Veiculos;

import Composicao.Pessoal.Cliente;

public class Carro extends Veiculo {

  private int numeroPassageiros;

  public Carro(String placa, Cliente cliente, int numeroPassageiros){
    super(placa, cliente);
    this.numeroPassageiros = numeroPassageiros;
  }

  @Override
  public void listar(){
    System.out.println(String.format("Carro Placa: %s. Número Passageiros: %d", getPlaca(), numeroPassageiros));
  }
}
