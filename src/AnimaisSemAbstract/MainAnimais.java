package AnimaisSemAbstract;

public class MainAnimais {

  public void doEmitirSom(IAnimais animal){
    animal.emitirSom();
  }

  public static void main(String[] args) {
     
      Cachorro c = new Cachorro();
      c.emitirSom();

      Gato g = new Gato();
      g.emitirSom();

      GatoMalhado gm = new GatoMalhado();
      
      Animal animais[] = new Animal[3];
      animais[0] = c;
      animais[1] = g;        

      Gato gatos[] = new Gato[3];
      gatos[0] = g;
      gatos[1] = gm;

      MainAnimais main = new MainAnimais();
      main.doEmitirSom(c);
      main.doEmitirSom(g);
      main.doEmitirSom(gm);
  }
}
