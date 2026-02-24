package Exercises;

import java.util.Scanner;

public class Ex5 {

    /*
     * Tokenização de Dados. Leia uma linha no seguinte formato:
     * nome;idade;curso;ira
     * Carlos Silva;21;Engenharia de Computação;8.75
     * O programa deve:
     * Separar os dados.
     * Exibir cada campo separadamente.
     * Converter idade para int e IRA para double.
     * Informar se o aluno está acima da média (IRA >= 7).
     * Métodos sugeridos: split(), trim(), parseInt(), parseDouble()
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dado = sc.nextLine(); // Joao;40;Eng Computação;8.3
        String[] palavras = dado.split(";");

        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        int idade = 0;
        if (palavras.length >= 2) {
            idade = Integer.parseInt(palavras[1]);
        }
        System.out.println("Idade: " + idade);

        if (palavras.length >= 3) {
            double ira = Double.parseDouble(palavras[3]);
            //System.out.println(String.format("IRA: %.2f", ira));

            if (ira >= 7) {
                System.out.println("Acima da média!");
            } else {
                System.out.println("Abaixo da média!");
            }
        }
        sc.close();
    }
}
