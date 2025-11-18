package Composicao;

import java.util.ArrayList;

import Composicao.Materiais.Peca;

public class MainOficina {
  public static void main(String[] args) {
    
    Peca martelo = new Peca("Martelo", 80);
    Peca chaveFenda = new Peca("Chave de Fenda", 35);
    Peca alicate = new Peca("Alicate", 16.7);

    Oficina oficina = new Oficina("Oficina POO");
    oficina.adicionarPeca(martelo);
    oficina.adicionarPeca(chaveFenda);
    oficina.adicionarPeca(alicate);

    oficina.listarPecas();

    oficina.removerPeca(martelo);

    oficina.listarPecas();

    Peca philips = new Peca("Philips", 41);

    oficina.adicionarPeca(philips);

    oficina.listarPecas();
  }
}
