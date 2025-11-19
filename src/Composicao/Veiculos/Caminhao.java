package Composicao.Veiculos;

import Composicao.Pessoal.Cliente;

public class Caminhao extends Veiculo {
  
  private int tacografo;

  public Caminhao(String placa, Cliente cliente, int tacografo){
    super(placa, cliente);
    this.tacografo = tacografo;
  }
}
