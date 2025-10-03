package Empresa;

public class MainEmpresa {
  public static void main(String[] args) {
    McDonalds mc = new McDonalds();
    mc.setPreco(50);
    mc.setQuantidadeVendida(2);
    float faturamento = mc.obterFaturamento();
    mc.exibirFaturamento();

    Volkswagem vw = new Volkswagem();
    vw.setPreco(50);
    vw.setQuantidadeVendida(2);
    faturamento = vw.obterFaturamento();
    vw.exibirFaturamento();
  }
}
