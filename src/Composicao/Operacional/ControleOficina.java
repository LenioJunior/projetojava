package Composicao.Operacional;

import java.util.Scanner;

import Composicao.Pessoal.Ajudante;
import Composicao.Pessoal.Funcionario;
import Composicao.Pessoal.Mecanico;

public class ControleOficina {

  private Oficina oficina;
  private Scanner sc;

  public ControleOficina() {
    sc = new Scanner(System.in);
  }

  private void criarOficina() {
    if(oficina == null){
      sc.nextLine();
      System.out.println("Informe o nome da oficina");
      String nome = sc.nextLine();
      oficina = new Oficina(nome);
    } else {
      System.out.println("A oficina já existe e não pode ser substituída!");
    }
  }

  private void exibirDadosOficina() {
    if (oficina == null){
      System.out.println("A oficina ainda não foi criada!");
    } else {
      oficina.listarDadosOficina();
    }
  }

  private void addMecanico(){

    if (oficina == null){
      System.out.println("A oficina ainda não foi criada!");
      return;
    }

    String nome;
    float salario;
    int anosExperiencia;

    nome = sc.nextLine();
    System.out.println("Informe o nome:");
    nome = sc.nextLine();

    System.out.println("Informe o salário:");
    salario = sc.nextFloat();

    System.out.println("Informe os anos de experiência:");
    anosExperiencia = sc.nextInt();

    Mecanico mecanico = new Mecanico(nome, salario, anosExperiencia);

    oficina.adicionarMecanico(mecanico);
  }

 private void addAjudante(){

    if (oficina == null){
      System.out.println("A oficina ainda não foi criada!");
      return;
    }

    String nome;
    float salario;
    String formacao;

    nome = sc.nextLine();
    System.out.println("Informe o nome:");
    nome = sc.nextLine();

    System.out.println("Informe o salário:");
    salario = sc.nextFloat();

    nome = sc.nextLine();
    System.out.println("Informe a formação:");
    formacao = sc.nextLine();

    Ajudante ajudante = new Ajudante(nome, salario, formacao);

    oficina.adicionarAjudante(ajudante);
  }

  private void exibeMenu(){
    System.out.println("Sistema de Oficina");
    System.out.println("----------------------");
    System.out.println("1) Criar Oficina");
    System.out.println("2) Exibir dados da Oficina");
    System.out.println("3) Adicionar Mecânico"); 
    System.out.println("4) Adicionar Ajudante");   
  }

  public void run(){
    
    int opcao = -1;
    do
    {
      exibeMenu();
      // leopcao
      opcao = sc.nextInt();
      switch (opcao) {
        case 1:
          criarOficina();
          break;
        case 2:
          exibirDadosOficina();
          break;
        case 3:
          addMecanico();
          break;
        case 4:
          addAjudante();
          break;
        default:
          System.out.println("Opção Inválida!");
          break;
      }
    }
    while (opcao != -1);
  }
}
