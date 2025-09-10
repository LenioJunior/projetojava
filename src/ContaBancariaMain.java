public class ContaBancariaMain {
  public static void main(String[] args) {
    System.out.println("--- Sistema Bancário ---");

    ContaBancaria contaLenio = new ContaBancaria("Lênio", "123");
    contaLenio.exibeDadosConta();
    
    contaLenio.depositar(100);
    contaLenio.mostraSaldo();

    contaLenio.sacar(80);
    contaLenio.mostraSaldo();

    contaLenio.sacar(30);

    contaLenio.depositar(2000);
    contaLenio.mostraSaldo();
  }
}
