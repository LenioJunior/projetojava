package Empresa;

public class Volkswagem extends Empresa {
  
  public float obterFaturamento(){
    faturamento = quantidadeVendida * preco * 1.5f;
    return faturamento;
  }
}
