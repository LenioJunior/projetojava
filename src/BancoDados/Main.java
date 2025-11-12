package BancoDados;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //IStorage fs = new FileStorage("/home/lenio/meu_arquivo.txt");
    IStorage fs = new JsonStorage("/home/lenio/meu_arquivo.json");
    Scanner sc = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("Escolha uma opção: ");
      System.out.println("1: Salvar arquivo");
      System.out.println("2: Ler arquivo");
      System.out.println("3: Sair");
      opcao = sc.nextInt();

      switch(opcao) {
        case 1:
          sc.nextLine();
          System.out.println("Informe o conteudo a ser salvo.");
          String tosave = sc.nextLine();
          fs.save(tosave);
          System.out.println("Arquivo salvo!");
          break;
        case 2:
          String dados = fs.read();
          System.out.println("Conteúdo lido do arquivo: " + dados); 
          break;
        case 3:
          System.out.println("Saindo...");
          break;     
        default:
          System.out.println("Opção Inválida...");
          break;
      }
    } while (opcao != 3);
    sc.close();
  }
}
