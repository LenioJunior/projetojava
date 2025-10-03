package Outros;
public class Carro {
  private String modelo;
  private String marca;
  private int ano;
  private int kilometragem;

  private String obterMarcaPeloModelo(){
    if(modelo == "Fiesta"){
      return "Ford";
    } else if(modelo == "Fusca"){
      return "Volks";
    } else {
      return "Ainda não consigo identificar a marca do modelo";
    }
  }

  private boolean fazCalculoKilometragem(){
    if(kilometragem >= 9000 && kilometragem <= 11000){
      return true;
    } else if(kilometragem >= 19000 && kilometragem <= 21000){
      return true;
    } else if(kilometragem >= 29000 && kilometragem <= 31000){
      return true;
    } else if(kilometragem >= 39000 && kilometragem <= 41000){
      return true;
    }
    return false;
  }

  public boolean necessitaRevisao(){
    return fazCalculoKilometragem();
  }

  public void exibirInfo(){
      marca = obterMarcaPeloModelo();
      String message = String.format("Marca: %s, Modelo: %s, Ano: %d", marca, modelo, ano);
      System.out.println(message);
  }

  public int getKilometragem(){
    return kilometragem;
  }

  public void setKilometragem(int kilometragem){
    this.kilometragem = kilometragem;
  }
  
  public String getModelo(){
    return modelo;
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public String getMarca(){
    return marca;
  }

  public int getAno(){
    return ano;
  }

  public void setAno(int ano){
    this.ano = ano;
  }
}
