package VetoresDinamicos;

import java.util.Arrays;
import java.util.Scanner;

public class Sistema {

  private Integer vetor[];
  private Scanner scanner = new Scanner(System.in);

  private void apresentaMenu(){
    System.out.println();
    System.out.println("--------------------------------------------------");
    System.out.println("Bem vindo ao sistema de armazenamento de números");
    System.out.println("1) Criar vetor");
    System.out.println("2) Preencher vetor");
    System.out.println("3) Listar vetor");
    System.out.println("4) Redimensionar vetor");
    System.out.println("5) Sair");
  }

  private int lerOpcaoEscolhida(){
    System.out.println("Informe a opção desejada:");
    return scanner.nextInt();
  }

  private int leTamanhoVetor(){
    int tamanhoVetor = 0;
    do {
      System.out.println("Informe um tamanho maior do que zero ao vetor.)");
      tamanhoVetor = scanner.nextInt();
    } while (tamanhoVetor <= 0);
    return tamanhoVetor;
  }

  private void criaVetor(){    
    int tamanhoVetor = leTamanhoVetor();
    vetor = new Integer[tamanhoVetor];
  }

  private int lerPosicaoLivre(){
    int posicaoLivre = -1;
    for (int i = 0; i < vetor.length; i++) {
      if(vetor[i] == null){
        posicaoLivre = i;
        break;
      }
    }
    return posicaoLivre;
  }

  private void preencherVetor(){
    if(vetorIsValido()){
      boolean inserirOutro = false;

      do{
        int posicaoLivre = lerPosicaoLivre();

        if(posicaoLivre == -1){
          System.out.println("O vetor está cheio. Não é possível inserir!");
          return;
        }
        
        System.out.println("Informe um número para armazenar no vetor");
        int valorAInserir = scanner.nextInt();
        
        vetor[posicaoLivre] = valorAInserir;

        boolean respondeuCorretamente = false;
        do {
          if(lerPosicaoLivre() != -1){
            System.out.println("Deseja inserir outro número?");
            String leitura = scanner.nextLine();
            if ("sim".equalsIgnoreCase(leitura)) {
              respondeuCorretamente = true;
              inserirOutro = true;
            } else if("nao".equalsIgnoreCase(leitura) || "não".equalsIgnoreCase(leitura)){
              respondeuCorretamente = true;
              inserirOutro = false;
            } else {
              System.out.println("Resposta inválida. Informe sim ou não.");
            }
          } else {
            respondeuCorretamente = true;
            inserirOutro = true;
          }
        } while (respondeuCorretamente == false);
        
      } while(inserirOutro == true);
    }
  }

  private boolean vetorIsValido(){
    if(vetor == null || vetor.length == 0){
      System.out.println("O vetor é nulo ou o tamanho é igual a zero.");
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return false;
    } else {
      return true;
    }
  }

  private void listaVetor(){
    if(vetorIsValido()){
      for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] != null) {
          String msg = String.format("O valor da posicao %d é: %d", (i + 1), vetor[i]);
          System.out.println(msg);
        }
      }
    }
  }

  private void redimensionarVetor(){
    if(vetorIsValido()){
      int tamanhoVetor = vetor.length;
      System.out.println(String.format("Informe um novo tamanho para o vetor, que seja maior do que %d.", tamanhoVetor));
      int novoTamanho = leTamanhoVetor();
      if(novoTamanho <= tamanhoVetor){
        System.out.println(String.format("O novo tamanho deve ser maior do que %d.", tamanhoVetor));
      } else {
        vetor = Arrays.copyOf(vetor, novoTamanho);
        System.out.println("O vetor foi redimensionado com tamanho " + novoTamanho);
      }
    }
  }

  private void executaOpcao(int opcao){
    switch (opcao) {
      case 1:
        System.out.println("--- Criando o vetor ---");
        criaVetor();
        break;    
      case 2:
        System.out.println("--- Preenchendo o vetor ---");
        preencherVetor();
        break;  
      case 3:
        System.out.println("--- Listando o vetor ---");
        listaVetor();
        break; 
      case 4:
        System.out.println("--- Redimensionando o vetor ---");
        redimensionarVetor();
        break; 
      case 5:
        System.out.println("--- Saindo do sistema ---");
        break;  
      default:
        System.out.println("Opção inválida!");
        break;
    }
  }

  public void executar(){
    int sair = 0;
    do {
      apresentaMenu();
      sair = lerOpcaoEscolhida();
      executaOpcao(sair);      
    } while (sair != 5);
  }
}
