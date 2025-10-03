package Heranca;

public class Pessoa {
  protected String nome;
  protected int idade;

  protected String getPronome(){
    String pronome = "";
    if(idade < 18){
      pronome = "Jovem";
    } else {
      pronome = "Sr";
    }
    return pronome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }  
}
