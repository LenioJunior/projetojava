package Composicao.Veiculos;

import java.util.ArrayList;

import Composicao.Operacional.OrdemServico;
import Composicao.Pessoal.Cliente;

public abstract class Veiculo {
  private String placa;

  private Cliente cliente;

  private ArrayList<OrdemServico> ordensServico;

  public Veiculo(String placa, Cliente cliente) {
    this.placa = placa;
    this.cliente = cliente;
    ordensServico = new ArrayList<OrdemServico>();
  }
}
