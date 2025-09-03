import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {

    public void lerDadosPessoa(){
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
 
        System.out.println("Informe seu nome:");
        pessoa.setNome(sc.nextLine());
        
        System.out.println("Informe o dia de nascimento:");
        pessoa.setDia(sc.nextInt());

        System.out.println("Informe o mês de nascimento:");
        pessoa.setMes(sc.nextInt());

        System.out.println("Informe o ano de nascimento:");
        pessoa.setAno(sc.nextInt());

        sc.close();

        int diasDeVida = pessoa.getDiasDeVida();
        System.out.println("Dias de vida: " + diasDeVida);
        System.out.println("Sua idade é: " + pessoa.getAnosVividos());
    }

    public void appCarros(){
        // Classe Carro com atributos: marca (texto), modelo (texto) e ano (número)
        // Instancie um Carro e exiba seus atributos.
        // Crie um método chamado exibirInfo() que mostre no console todos os dados do carro em uma única linha.
        // Exemplo de saída: Marca: Chevrolet, Modelo: Onix, Ano: 2020
        // Modifique a classe Carro para que os atributos marca, modelo e ano sejam privados.
        // Crie métodos get e set para acessar e modificar esses atributos.
        // Teste alterando os valores do carro criado anteriormente.

        Carro carro1 = new Carro();
        carro1.setModelo("Fiesta");
        carro1.setAno(2019);
        carro1.setKilometragem(3000); 

        carro1.exibirInfo();
        System.out.println("Necessita revisão? " + carro1.necessitaRevisao());

        Carro carro2 = new Carro();
        carro2.setModelo("Fusca");
        carro2.setAno(2025);
        carro2.setKilometragem(10700); 

        carro2.exibirInfo();
        System.out.println("Necessita revisão? " + carro2.necessitaRevisao());
    }

    public void appAlunos(){
        Aluno a1 = new Aluno();
        a1.lerNotas();
        a1.lerFrequencia();
        a1.exibirStatus();
    }


    public static void main(String[] args) throws Exception {
        // App app = new App();
        // //app.lerDadosPessoa();
        // //app.appCarros();
        // app.appAlunos();

        Scanner sc = new Scanner(System.in);
        float notas[] = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a nota: " + (i + 1)); //printf("Informe a nota: %d");
            notas[i] = sc.nextFloat(); //scanf("%f", &notas[i]);
        }
        
        float soma = 0;        
        for(int i = 0; i < 3; i++){
            soma = soma + notas[i];
        }

        float media = (float) soma / 3;       

        int frequencia[] = new int[4];

        // 0 - 1 - 1 - 1

        for(int i = 0; i < 4; i++){
            System.out.println(String.format("Informe a frequência %d.", (i + 1)));
            frequencia[i] = sc.nextInt();
        }

        int contaPresenca = 0;
        for (int i = 0; i < 4; i++) {
            if(frequencia[i] == 1){
                contaPresenca++;
            }
        }

        String v = String.format("Sua media é: %.2f", media);
        System.out.println(v);
        
        float percentualFrequencia = (float) contaPresenca / 4 * 100; // frequencia.length

        System.out.println(String.format("Seu percentual de frequência é: %.2f", percentualFrequencia));

        // contaPresenca 3 

        if(percentualFrequencia >= 75 && media >= 6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // Valores lidos para nota: 8, 9, 3
        // Valores lidos para frequencia: 1, 1, 0, 0
        for (int i = 0; i < notas.length; i++) {
            System.out.println(String.format("Sua nota %d: %.2f", (i + 1), notas[i]));
        }

        for (int i = 0; i < frequencia.length; i++) {
            String status = "";
            if(frequencia[i] == 1){
                status = "Presente";
            } else {
                status = "Ausente";
            }
            System.out.println(String.format("Sua frequência %d: %s", (i + 1), status));
        }
    }
}
