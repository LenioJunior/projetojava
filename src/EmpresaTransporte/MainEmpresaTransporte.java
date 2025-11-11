package EmpresaTransporte;

import java.util.ArrayList;

public class MainEmpresaTransporte {
  public static void main(String[] args) {

    Motorista motorista = new Motorista("Juliano", 1000, 5);
    motorista.calcularSalario();
    motorista.exibirInfo();

    Gerente gerente = new Gerente("Zeca", 5000, 1300);
    gerente.calcularSalario();
    gerente.exibirInfo();
  }
}
