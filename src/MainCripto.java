import java.util.Scanner;

public class MainCripto {
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Informe uma frase:");
    // String conteudo = scanner.nextLine();

    String conteudo = "hojeeumbomdiauvz";
    Cripto cripto = new Cripto(conteudo);
    cripto.criptografar(1);
    String criptografado = cripto.getCriptografado();
    System.out.println("Conteudo: " + conteudo);
    System.out.println("Criptografado: " + criptografado);

    // for (int i = 65; i <= 90; i++) {
    //   char letra = (char)i;
    //   System.out.println("Letra: " + letra);
    // }

    // for (int i = 97; i <= 122; i++) {
    //   char letra = (char)i;
    //   System.out.println("Letra: " + letra);
    // }

    cripto.descriptografar(1);
    String descriptografado = cripto.getDescriptografado();
    System.out.println("Descriptografado: " + descriptografado);
  }
}
