public class Jogo {
  public static void main(String[] args) {
    System.out.println("--- Iniciando Jogo ---");
    Jogador jog1 = new Jogador("Player 1", 100, 50);
    Jogador jog2 = new Jogador("Player 2", 80, 90);

    jog1.exibirStatus();
    jog2.exibirStatus();

    jog1.atacar(jog2, 50);

    jog1.exibirStatus();
    jog2.exibirStatus();

    jog2.atacar(jog1, 90);

    jog1.exibirStatus();
    jog2.exibirStatus();

    jog1.atacar(jog2, 30);

    jog1.exibirStatus();
    jog2.exibirStatus();
  }
}
