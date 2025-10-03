package Criptografia;
public class CriptoMain {
  public static void main(String[] args) {
    Criptografia c = new Criptografia("Muito prazer");
    System.out.println(String.format("Conteúdo: %s", c.getConteudo()));

    c.criptografar();
    System.out.println(String.format("Criptografado: %s", c.getCriptografado()));

    c.descriptografar();
    System.out.println(String.format("Descriptografado: %s", c.getDescriptografado()));
  }
}
