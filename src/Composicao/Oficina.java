package Composicao;

import java.util.ArrayList;

import Composicao.Materiais.Peca;
import Composicao.Pessoal.Funcionario;
import Composicao.Veiculos.Veiculo;

public class Oficina {

  private String nome;

  private ArrayList<Peca> pecas;
  private ArrayList<Funcionario> funcionarios;
  private ArrayList<Veiculo> veiculos;

  /*
    Adicionar método para adicionarFuncionario, removerFuncionario e listarFuncionarios
    Adicionar método para adicionarVeiculo, removerVeiculo, listarVeiculos e listarOrdensdeServico
   */

  public Oficina(String nome) {
    pecas = new ArrayList<>();
    funcionarios = new ArrayList<>();
    veiculos = new ArrayList<>();

    this.nome = nome;
  }

  public void adicionarPeca(Peca peca){
    pecas.add(peca);
  }

  public Peca removerPeca(Peca peca){
    int indice = pecas.indexOf(peca);
    if (indice == -1)
      return null;
    
    return pecas.remove(indice);
  }

  public void listarPecas(){
    System.out.println("------ Oficina -------");
    System.out.println(String.format("%s", nome));
    System.out.println("------ Listagem de Peças ------");
    for(Peca peca : pecas){
      System.out.println(String.format("Peça: %s. Valor: %.2f", peca.getNome(), peca.getValor()));
    }
  }

  public ArrayList<Peca> getPecas() {
    return pecas;
  }

  public String getNome() {
    return nome;
  }
}
