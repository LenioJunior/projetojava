package BancoDados;

public class JsonStorage implements IStorage {

  private String filename;

  public JsonStorage(String filename) {
    this.filename = filename;
  }

  @Override
  public String read() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'read'");
  }

  @Override
  public boolean save(String dados) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }
  
}
