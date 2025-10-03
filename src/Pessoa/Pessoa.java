package Pessoa;
import java.time.LocalDate;

public class Pessoa {

  private String nome = "Lênio";
  private int ano;
  private int mes;
  private int dia;

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public String getNome() {
    return nome;
  }


  public int getAnosVividos(){
    LocalDate dataAtual = LocalDate.now();
    int anoAtual = dataAtual.getYear();
    int mesAtual = dataAtual.getMonthValue();
    int diaAtual = dataAtual.getDayOfMonth();

    int anosVividos = anoAtual - this.ano;
    if(mesAtual < this.mes){
      anosVividos--;

    } else if(mesAtual == this.mes && diaAtual < this.dia){
        anosVividos--;
    }

    return anosVividos;
  }

  public int getDiasDeVida(){
    LocalDate dataAtual = LocalDate.now();
    int anoAtual = dataAtual.getYear();
    int mesAtual = dataAtual.getMonthValue();
    //int diaAtual = dataAtual.getDayOfMonth();

    int anosVividos = anoAtual - ano;
    int mesesVividos = 0;
    int diasVividos = 0;

    if(mesAtual > mes){
      anosVividos--;
      mesesVividos = 12 - mes + mesAtual;
    }
    diasVividos = (anosVividos * 365) + 
    (mesesVividos * 30);

    return diasVividos;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
