package Pessoa;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import Aluno.AlunoOld;
import Outros.Carro;

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
        AlunoOld a1 = new AlunoOld();
        a1.lerNotas();
        a1.lerFrequencia();
        a1.exibirStatus();
    }


    public static void main(String[] args) throws Exception {
        // App app = new App();
        // //app.lerDadosPessoa();
        // //app.appCarros();
        // app.appAlunos();
    }
}
