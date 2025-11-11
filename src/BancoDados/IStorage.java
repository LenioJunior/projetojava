package BancoDados;

public interface IStorage {

  public String read();

  public boolean save(String dados);
}