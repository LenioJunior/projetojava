package Composicao.Materiais;

public abstract class Material {
  private String descricao;
  private float valor;
  private TipoMaterial tipo;

  public Material(String descricao, float valor, TipoMaterial tipo){
    this.descricao = descricao;
    this.valor = valor;
    this.tipo = tipo;
  }

  public void listar(){
    System.out.println(String.format("Material: %s. Valor: %.2f", getDescricao(), getValor()));
  }

  public String getDescricao() {
    return descricao;
  }

  public float getValor() {
    return valor;
  }

  public TipoMaterial getTipo() {
    return tipo;
  }
}
