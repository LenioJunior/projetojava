import java.util.Scanner;

public class MainContaBancaria {

  private Scanner scanner = new Scanner(System.in);

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

  public int lerOpcao(){
    System.out.println("Informe a opção desejada:");
    return scanner.nextInt();
  }

  public ContaBancaria criarConta(){
    System.out.println("Informe o nome do titular");
    String titular = scanner.nextLine();

    System.out.println("Informe o cpf do titular");
    String cpf = scanner.nextLine();

    ContaBancaria cb1 = new ContaBancaria(titular, cpf);

    return cb1; 
  }

  public void exibirDadosConta(ContaBancaria cb1){
      String msg = String.format("Titular: %s\nCPF: %s\nSaldo: %.2f", cb1.getTitular(), cb1.getCpf(), cb1.getSaldo());
  }

  public static void main(String[] args) {
    MainContaBancaria main = new MainContaBancaria();
    int opcao;
    ContaBancaria cb1 = null;

    do {
      main.exibeMenu();
      opcao = main.lerOpcao();
      switch (opcao) {
        case 1:
          cb1 = main.criarConta();                
          break;
        case 2:
          main.exibirDadosConta(cb1);
          break;
        case 3:
          // depositar
          break;
        case 4:
          // sacar
          break;
        case 5:
          // saldo
          break;
        default:
          // msg de opção errada!
          break;
      }
    } while (opcao != 6);
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Criando uma conta bancária.");

    // System.out.println("Informe o valor a ser depositado");
    // double valor = scanner.nextDouble();
    // cb1.depositar(valor);

    // msg = String.format("Titular: %s\nCPF: %s\nSaldo: %.2f", cb1.getTitular(), cb1.getCpf(), cb1.getSaldo());
    // System.out.println(msg);

    // System.out.println("Informe o valor a ser depositado");
    // valor = scanner.nextDouble();

    // if(cb1.depositar(valor)){
    //   System.out.println("Depósito efetuado com sucesso!");
    // } else {
    //   System.out.println("Depósito não efetuado. Valor deve ser maior do que zero!");
    // }
    // System.out.println(String.format("Saldo: %.2f", cb1.getSaldo()));

    // System.out.println("Informe o valor a ser sacado");
    // valor = scanner.nextDouble();
    // if(cb1.sacar(valor)){
    //   System.out.println("Saque efetuado com sucesso!");
    // } else {
    //   System.out.println("Saldo insuficiente!");
    // }
    // System.out.println(String.format("Saldo: %.2f", cb1.getSaldo()));

    // System.out.println("Informe o valor a ser sacado");
    // valor = scanner.nextDouble();
    // if(cb1.sacar(valor)){
    //   System.out.println("Saque efetuado com sucesso!");
    // } else {
    //   System.out.println("Saldo insuficiente!");
    // }
    // System.out.println(String.format("Saldo: %.2f", cb1.getSaldo()));
  }
}
