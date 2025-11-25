package Composicao.Operacional;

import java.util.ArrayList;

import Composicao.Materiais.Material;
import Composicao.Materiais.Peca;
import Composicao.Pessoal.Ajudante;
import Composicao.Pessoal.Cliente;
import Composicao.Pessoal.Funcionario;
import Composicao.Pessoal.Mecanico;
import Composicao.Veiculos.Veiculo;

public class Oficina {

  private String nome;

  private ArrayList<Funcionario> funcionarios;
  private ArrayList<Material> materiais;
  private ArrayList<Veiculo> veiculos;
  private ArrayList<Cliente> clientes;

  /*
   * Adicionar método para adicionarFuncionario, removerFuncionario e
   * listarFuncionarios
   * Adicionar método para adicionarVeiculo, removerVeiculo, listarVeiculos e
   * listarOrdensdeServico
   */

  public Oficina(String nome) {
    materiais = new ArrayList<>();
    funcionarios = new ArrayList<>();
    veiculos = new ArrayList<>();
    clientes = new ArrayList<>();

    this.nome = nome;
  }

  public void adicionarMaterial(Material material) {
    materiais.add(material);
  }

  public Material removerPeca(Material material) {
    int indice = materiais.indexOf(material);
    if (indice == -1)
      return null;

    return materiais.remove(indice);
  }

  public void listarDadosOficina() {
    System.out.println("------ Oficina -------");
    System.out.println(String.format("%s", nome));

    listarFuncionarios();
    listarVeiculos();
    listarClientes();
    listarMateriais();
  }

  public void listarFuncionarios() {
    System.out.println("------ Listagem de Funcionários ------");
    for (Funcionario funcionario : funcionarios) {
      funcionario.listar();
    }
  }

  public void listarVeiculos() {
    System.out.println("------ Listagem de Veículos ------");
    for (Veiculo veiculo : veiculos) {
      veiculo.listar();
    }
  }

  public void listarClientes() {
    System.out.println("------ Listagem de Clientes ------");
    for (Cliente cliente : clientes) {
      cliente.listar();
    }
  }

  public void listarMateriais() {
    System.out.println("------ Listagem de Materiais ------");
    for (Material material : materiais) {
      material.listar();
    }
  }

  public ArrayList<Material> getMateriais() {
    return materiais;
  }

  public String getNome() {
    return nome;
  }

  public void adicionarMecanico(Mecanico mecanico) {
    adicionarFuncionario(mecanico);
  }

  public void adicionarAjudante(Ajudante ajudante) {
    adicionarFuncionario(ajudante);
  }

  private void adicionarFuncionario(Funcionario funcionario){
    int indice = funcionarios.indexOf(funcionario);
    if (indice != -1){
      System.out.println("O funcionário já está cadastrado na oficina!");
      return;
    }

    funcionarios.add(funcionario);
    System.out.println("Funcionário adicionado com sucesso!");
  }
}
