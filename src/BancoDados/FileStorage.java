package BancoDados;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStorage implements IStorage {

  private String filename;

  public FileStorage(String filename) {
    this.filename = filename;
  }

  @Override
  public String read() {
    String conteudo = "";
    FileInputStream stream;
    try {
      int value;
      stream = new FileInputStream(filename);
      do {
        value = stream.read();
        if(value != -1){
            conteudo += (char)value;
          }
      } while (value != -1);
      stream.close();
    } 
    catch(FileNotFoundException ex) {
      // Logar em um arquivo de log da app.
      System.out.println("Não foi possível ler o arquivo: " + filename);
    }
    catch(IOException ex){
      System.out.println("Erro ao efetuar a leitura do conteúdo: " + ex.getMessage());
    }
    
    return conteudo;
  }

  @Override
  public boolean save(String dados) {
    FileOutputStream stream;
    try {
      stream = new FileOutputStream(filename);

      byte data [] = dados.getBytes(); 
      stream.write(data);
      stream.close();
      return true;
    } catch (FileNotFoundException e) {
      System.out.println("Não foi possível abrir o arquivo: " + filename);
    } catch (IOException ex){
      System.out.println("Erro ao gravar dados no arquivo: " + filename + ". Erro: " + ex.getMessage());
    }
    return false;
  }  
}
