package Composicao.Materiais;

public class Ferramenta extends Material {
  private String especificacoes;

  public Ferramenta(String descricao, float valor, TipoMaterial tipo, String especificacoes) {
    super(descricao, valor, tipo);
    this.especificacoes = especificacoes;
  }
}
