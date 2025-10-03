package Jogo;
public class Jogador {
  private int vida;
  private int poder;
  private String nome;

  public int getVida() {
    return vida;
  }

  public int getPoder() {
    return poder;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Jogador(String nome, int vidaInicial, int poderInicial){
    this.nome = nome;
    vida = vidaInicial;
    poder = poderInicial;
  }

  public void atacar(Jogador jogador, int dano){
    int vidaRestante = jogador.sofrerAtaque(dano);
    if(vidaRestante <= 0){
      poder += 10;
    }
  }

  public int sofrerAtaque(int dano){
    vida -= dano;
    return vida;
  }

  public void transferirPoder(Jogador jogador, int quantidade){
    jogador.ganharPoder(quantidade);
  }

  public void ganharPoder(int nivel){
    poder += nivel;
  }

  public void exibirStatus(){
    String message = String.format("Personagem %s\nVida: %d\nPoder: %d\n----------------\n", nome, vida, poder);
    System.out.println(message);
  }
}
