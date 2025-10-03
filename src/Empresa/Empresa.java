package Empresa;

public class Empresa {

  protected String razaoSocial;
  protected String cnpj;
  protected float faturamento;
  protected int quantidadeVendida;
  protected float preco;

  public void exibirFaturamento(){
    System.out.println("O faturamento foi de: " + faturamento);
  }

  public int getQuantidadeVendida() {
    return quantidadeVendida;
  }
  public void setQuantidadeVendida(int quantidadeVendida) {
    this.quantidadeVendida = quantidadeVendida;
  }
  public float getPreco() {
    return preco;
  }
  public void setPreco(float preco) {
    this.preco = preco;
  }
  
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
  public float getFaturamento() {
    return faturamento;
  }

  
}
