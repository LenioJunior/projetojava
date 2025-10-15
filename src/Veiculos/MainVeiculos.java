package Veiculos;

public class MainVeiculos {
  public static void main(String[] args) {
    // Veiculo veiculo = new Veiculo();
    // veiculo.setMarca("Chevrolet");
    // veiculo.setModelo("Onix");
    // veiculo.setAno(2025);

    // veiculo.ligar();
    // veiculo.desligar();
    // veiculo.exibirInfo();

    // Moto moto = new Moto();
    // moto.setMarca("Harley");
    // moto.setModelo("HX 350");
    // moto.setAno(2020);
    // moto.exibirInfo();

    // Carro carro = new Carro();
    // carro.setMarca("Ford");
    // carro.setModelo("K");
    // carro.setAno(2023);

    CarroOffRoad carroOffRoad = new CarroOffRoad();
    carroOffRoad.setNumeroDePortas(10);
    carroOffRoad.setMarca("Marca Offroad");
    carroOffRoad.setModelo("Modelo Offroad");
    carroOffRoad.setNumeroDePortas(4);
    carroOffRoad.exibirInfo();
  }
}
