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

  public abstract void listar();

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public ArrayList<OrdemServico> getOrdensServico() {
    return ordensServico;
  }

  public void setOrdensServico(ArrayList<OrdemServico> ordensServico) {
    this.ordensServico = ordensServico;
  }

  
}
