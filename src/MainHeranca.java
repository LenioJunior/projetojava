

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Heranca.Aluno;
import Heranca.Pessoa;

public class MainHeranca {
  
  public static void main(String[] args) {
    
    Pessoa pessoa = new Pessoa();
    pessoa.setIdade(20);
    pessoa.setNome("Lucas");
    //pessoa.processaPronome();

    Aluno aluno = new Aluno();
    aluno.setNome("João da Silva Sauro");
    aluno.setIdade(14);
    aluno.apresentaNome();
  }
}
