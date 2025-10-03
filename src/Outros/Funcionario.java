package Outros;
public class Funcionario {
  public static int contador;

  private String nome;

  public static int progresso;

  public static int cargo;

  public Funcionario(String nome, int cargo){
    this.nome = nome;
    this.cargo = cargo;
  }

  public static void boasVindas(){
    System.out.println("Olá, seja bem vindo!");
  }

  public static boolean progrediu(){
    double resultado = (double)progresso / 10;
    if(cargo == 0 && resultado > 1){
      cargo = 1;
      return true;
    } else {
      cargo = 0;
      return false;
    }
  }
}
