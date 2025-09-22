import java.util.Scanner;

public class Funcoes {

  private ContaBancaria conta;
  private Scanner sc = new Scanner(System.in);

  public void exibeMenu(){
    System.out.println("Sistema Bancário Versão 1.0");
    System.out.println("----------------------");
    System.out.println("1) Criar conta bancária");
    System.out.println("2) Exibir dados da bancários");
    System.out.println("3) Depositar");
    System.out.println("4) Sacar");
    System.out.println("5) Saldo");
    System.out.println("6) Sair");
  }

  public void criarConta(){
    // Ler nome
    String nome = sc.nextLine();    
    // ler cpf
    String cpf = sc.nextLine();
    // Instanciar contabancaria
    conta = new ContaBancaria(nome, cpf);
  }

  public void realizarDeposito(){    
    if(conta != null){
      double valor = sc.nextDouble();
      conta.depositar(valor);
    } else {
      // Mostrar msg de erro.
      System.out.println("Erro pois conta está nula!");
    }   
  }

  public void realizarSaque(){
    if(conta != null){
      double valor = sc.nextDouble();
      conta.sacar(valor);
    }
  }

  public void exibirSaldo(){
    if(conta != null){
      System.out.println("Saldo: " + conta.getSaldo());
    }
  }

  public static void main(String[] args) {
    Funcoes funcoes = new Funcoes();

    int opcao = -1;
    do
    {
      funcoes.exibeMenu();
      // leopcao
      opcao = funcoes.sc.nextInt();
      switch (opcao) {
        case 1:
          funcoes.criarConta();
          break;
        case 3:
          funcoes.realizarDeposito();
          break;
        case 4:
          funcoes.realizarSaque();
          break;
        case 5:
          funcoes.exibirSaldo();
          break;
        default:
          System.out.println("Opção Inválida!");
          break;
      }
    }
    while (opcao != -1);
  }
}
