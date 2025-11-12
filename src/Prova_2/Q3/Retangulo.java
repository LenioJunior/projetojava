package Prova_2.Q3;

public class Retangulo extends Forma{

  private double largura;

  public double getLargura() {
    return largura;
  }

  public void setLargura(double largura) {
    this.largura = largura;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  private double altura;
  
  @Override
  public double calcularArea() {
    return largura * altura;
  }  
}
