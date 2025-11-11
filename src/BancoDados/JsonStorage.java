package BancoDados;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonStorage implements IStorage {

  private String filename;

  public JsonStorage(String filename) {
    this.filename = filename;
  }

  @Override
  public String read() {
    Gson gson = new Gson();

    try (FileReader reader = new FileReader(filename)) {
        return gson.fromJson(reader, String.class);

    } catch (IOException e) {
        e.printStackTrace();
        return null;
    }
  }

  @Override
  public boolean save(String dados) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    try (Writer writer = new FileWriter(filename)) {
        gson.toJson(dados, writer);
        System.out.println("JSON gravado com sucesso: " + filename);
        return true;
    } catch (IOException e) {
        System.err.println("Erro ao gravar o arquivo JSON: " + e.getMessage());
    }
    return false;
  }  
}
