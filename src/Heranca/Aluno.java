package Heranca;

public class Aluno extends Pessoa{
 
  public void apresentaNome(){
    String pronome = getPronome();
    System.out.println(pronome + " " + nome);
  }
}
