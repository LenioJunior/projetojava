package Aluno;
public class MainProva {
  public static void main(String[] args) {

    AlunoProva a = new AlunoProva(3);
    a.setNome("Pedro");
    a.setCurso("Computação");
    a.setMatricula(1000);
    a.lerNotas();    
    a.exibirResultado();


    AlunoProva b = new AlunoProva(4);
    b.setNome("Carlos");
    b.setCurso("Enfermagem");
    b.setMatricula(2000);
    b.lerNotas();
    b.exibirResultado();
  }
}
