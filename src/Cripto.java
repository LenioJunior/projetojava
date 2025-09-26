public class Cripto {
  private String conteudo;
  private String criptografado = "";
  private String descriptografado = "";

  private char alfabeto [] = {
   'a','b','c','d','e','f','g','h','i','j',
   'k','l','m','n','o','p','q','r','s','t',
   'u','v','w','x','y','z', ' '};


  public Cripto(String conteudo) {
    this.conteudo = conteudo;
  }

  private void trocarLetras(){
    char conteudoArray[] = conteudo.toCharArray();
    for (int i = 0; i < conteudoArray.length; i++) {
      char letra = conteudoArray[i];
      int letraInt = (int)letra;
      letraInt += 5;
      if(letraInt > 122){
        letraInt = 97 + letraInt - 122 - 1;
      }
      criptografado += (char)letraInt;
    }
  }

  private void destrocarLetras(){
    char conteudoArray[] = criptografado.toCharArray();
    for (int i = 0; i < conteudoArray.length; i++) {
      char letra = conteudoArray[i];
      int letraInt = (int)letra;
      letraInt -= 5;
      if(letraInt < 97){
        letraInt = 122 - (97 - letraInt - 1);
      }
      descriptografado += (char)letraInt;
    }
  }

  public String criptografar(int opcao){    
    switch (opcao) {
      case 1:
        // Criptografar com opção 1
        trocarLetras();
        break;
      case 2:
        // Criptografar com opção 2
        break;    
      default:
        System.out.println("Opção inválida, não é possível criptografar!");
        break;
    }
    return criptografado;
  }

  public String descriptografar(int opcao){  
      switch (opcao) {
      case 1:
        // Descriptografar com opção 1
        destrocarLetras();
        break;
      case 2:
        // Descriptografar com opção 2
        break;    
      default:
        System.out.println("Opção inválida, não é possível criptografar!");
        break;
    }
    return descriptografado;
  }
  
  public String getConteudo() {
    return conteudo;
  }
  public String getCriptografado() {
    return criptografado;
  }
  public String getDescriptografado() {
    return descriptografado;
  }  
}
