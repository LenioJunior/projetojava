package Composicao;

import java.util.ArrayList;

import Composicao.Materiais.Ferramenta;
import Composicao.Materiais.Peca;
import Composicao.Materiais.TipoMaterial;
import Composicao.Operacional.Oficina;

public class MainOficina {

  public void CreateOficina(Oficina oficina){

  }

  public static void main(String[] args) {
    
    Ferramenta martelo = new Ferramenta("Martelo", 80f, TipoMaterial.FERRAMENTA, "Amarela");
    Ferramenta chaveFenda = new Ferramenta("Chave de Fenda", 35,
    TipoMaterial.FERRAMENTA, "N18");
    Ferramenta alicate = new Ferramenta("Alicate", 16.7f, TipoMaterial.FERRAMENTA, "Amarela");

    Oficina oficina = new Oficina("Oficina POO");
    oficina.adicionarMaterial(martelo);
    oficina.adicionarMaterial(chaveFenda);
    oficina.adicionarMaterial(alicate);

    oficina.listarMateriais();

    oficina.removerPeca(martelo);

    oficina.listarMateriais();

    Peca philips = new Peca("Philips", 41, TipoMaterial.PECA, "Número 20");

    oficina.adicionarMaterial(philips);

    oficina.listarMateriais();
  }
}
