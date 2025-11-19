package Composicao.Materiais;

public class Peca extends Material{

  private String modelo;

  public Peca(String descricao, float valor, TipoMaterial tipo, String modelo) {
    super(descricao, valor, tipo);
    this.modelo = modelo;
  }
}
