package Composicao.Operacional;

import java.util.ArrayList;

import Composicao.Materiais.Material;
import Composicao.Materiais.Peca;
import Composicao.Pessoal.Cliente;
import Composicao.Pessoal.Funcionario;
import Composicao.Veiculos.Veiculo;

public class Oficina {

  private String nome;

  private ArrayList<Funcionario> funcionarios;
  private ArrayList<Material> materiais;
  private ArrayList<Veiculo> veiculos;
  private ArrayList<Cliente> clientes;

  /*
    Adicionar método para adicionarFuncionario, removerFuncionario e listarFuncionarios
    Adicionar método para adicionarVeiculo, removerVeiculo, listarVeiculos e listarOrdensdeServico
  */

  public Oficina(String nome) {
    materiais = new ArrayList<>();
    funcionarios = new ArrayList<>();
    veiculos = new ArrayList<>();

    this.nome = nome;
  }

  public void adicionarMaterial(Material material){
    materiais.add(material);
  }

  public Material removerPeca(Material material){
    int indice = materiais.indexOf(material);
    if (indice == -1)
      return null;
    
    return materiais.remove(indice);
  }

  public void listarMateriais(){
    System.out.println("------ Oficina -------");
    System.out.println(String.format("%s", nome));
    System.out.println("------ Listagem de Materiais ------");
    for(Material material : materiais){
      System.out.println(String.format("Material: %s. Valor: %.2f", material.getDescricao(), material.getValor()));
    }
  }

  public ArrayList<Material> getMateriais() {
    return materiais;
  }

  public String getNome() {
    return nome;
  }
}
