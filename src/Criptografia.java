public class Criptografia {
  private static int deslocamento = 5;

  private char alfabeto [] = {
    'a','b','c','d','e','f','g','h','i','j',
    'k','l','m','n','o','p','q','r','s','t',
    'u','v','w','x','y','z', ' '
  };
  private String conteudo;
  private String criptografado;
  private String descriptografado;

  public String getConteudo() {
    return conteudo;
  }

  public String getCriptografado() {
    return criptografado;
  }

  public String getDescriptografado() {
    return descriptografado;
  }

  public Criptografia(String conteudo) {
    this.conteudo = conteudo;
  }

  private int encontrarPosicaoLetra(char letra){
    for (int i = 0; i < alfabeto.length; i++) {
      char alfabetoM = Character.toUpperCase(alfabeto[i]);
      char letraM = Character.toUpperCase(letra);
      if(alfabetoM == letraM){
        return i;
      }
    }
    return -1;
  }

  public void criptografar(){
    criptografado = "";
    char conteudoArray[] = conteudo.toCharArray();

    for (int i = 0, j = i + deslocamento; i < conteudoArray.length && j < conteudoArray.length; i++) {
      int pos = encontrarPosicaoLetra(conteudoArray[i]);
      pos += deslocamento;
      if(pos > alfabeto.length){
        pos -= alfabeto.length;        
      }
      criptografado += alfabeto[pos];
    }
  }

  public void descriptografar(){
    descriptografado = "";
    char conteudoArray[] = criptografado.toCharArray();

    for (int i = 0, j = i - deslocamento; i < conteudoArray.length && j < conteudoArray.length; i++) {
      int pos = encontrarPosicaoLetra(conteudoArray[i]);
      pos -= deslocamento;
      if(pos < 0){
        pos = alfabeto.length - Math.abs(pos);
      }
      descriptografado += alfabeto[pos];
    }
  }
}
