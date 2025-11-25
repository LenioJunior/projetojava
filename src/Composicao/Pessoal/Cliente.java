package Composicao.Pessoal;

import java.util.Date;

public class Cliente {
  private String nome;
  private Date dataCadastro;

  public Cliente(String nome, Date dataCadastro) {
    this.nome = nome;
    this.dataCadastro = dataCadastro;
  }

  public void listar(){
    System.out.println(String.format("Cliente: %s. Data Cadastro: %s", nome, dataCadastro));
  }
}
