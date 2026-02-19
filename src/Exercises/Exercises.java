package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercises {

    public static void ex1_StringComparison() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro nome: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite o segundo nome: ");
        String nome2 = sc.nextLine();

        System.out.println("\nIgual (case-sensitive)? " + nome1.equals(nome2));
        System.out.println("Igual (ignore case)? " + nome1.equalsIgnoreCase(nome2));

        int comp = nome1.compareToIgnoreCase(nome2);

        if (comp < 0)
            System.out.println(nome1 + " vem antes alfabeticamente.");
        else if (comp > 0)
            System.out.println(nome2 + " vem antes alfabeticamente.");
        else
            System.out.println("São equivalentes alfabeticamente.");

        sc.close();
    }

    public static void ex2_TextAnalyser() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int total = frase.length();
        int semEspaco = frase.replace(" ", "").length();

        int vogais = 0, consoantes = 0;
        String f = frase.toLowerCase();

        for (int i = 0; i < f.length(); i++) {
            char c = f.charAt(i);
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vogais++;
                else
                    consoantes++;
            }
        }

        System.out.println("Total caracteres: " + total);
        System.out.println("Sem espaços: " + semEspaco);
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);

        sc.close();
    }

    public static void ex3_PasswordAnalyser() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        boolean tamanho = senha.length() >= 8;
        boolean maiuscula = false, numero = false, especial = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c))
                maiuscula = true;
            if (Character.isDigit(c))
                numero = true;
            if (!Character.isLetterOrDigit(c))
                especial = true;
        }

        System.out.println("Mínimo 8 caracteres: " + tamanho);
        System.out.println("Possui maiúscula: " + maiuscula);
        System.out.println("Possui número: " + numero);
        System.out.println("Possui especial: " + especial);

        if (tamanho && maiuscula && numero && especial)
            System.out.println("Senha válida!");
        else
            System.out.println("Senha inválida.");

        sc.close();
    }

    public static void ex4_InverterAndPalindromo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = sc.nextLine();

        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        System.out.println("Invertida: " + invertida);

        String limpa = texto.toLowerCase().replace(" ", "");
        String limpaInv = "";
        for (int i = limpa.length() - 1; i >= 0; i--) {
            invertida += limpa.charAt(i);
        }

        System.out.println("É palíndromo? " + limpa.equals(limpaInv));

        sc.close();
    }

    public static void ex5_Tokenization() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite no formato nome;idade;curso;ira: ");
        String linha = sc.nextLine();

        String[] dados = linha.split(";");

        String nome = dados[0].trim();
        int idade = Integer.parseInt(dados[1].trim());
        String curso = dados[2].trim();
        double ira = Double.parseDouble(dados[3].trim());

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("IRA: " + ira);

        System.out.println(ira >= 7 ? "Acima da média" : "Abaixo da média");

        sc.close();
    }

    public static void ex6_WordsFrequency() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        System.out.print("Digite a palavra para buscar: ");
        String busca = sc.nextLine();

        String[] palavras = texto.split("\\s+");

        int cont = 0;
        String maior = "";

        for (String p : palavras) {
            if (p.equalsIgnoreCase(busca))
                cont++;

            if (p.length() > maior.length())
                maior = p;
        }

        System.out.println("Total palavras: " + palavras.length);
        System.out.println("Ocorrências: " + cont);
        System.out.println("Palavra mais longa: " + maior);

        sc.close();
    }

    public static void ex7_MailValidator() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o e-mail: ");
        String email = sc.nextLine();

        boolean valido = true;

        if (email.contains(" "))
            valido = false;
        if (email.indexOf("@") != email.lastIndexOf("@"))
            valido = false;
        if (!email.contains("@"))
            valido = false;

        int posArroba = email.indexOf("@");
        if (posArroba <= 0 || posArroba >= email.length() - 1)
            valido = false;

        if (!email.substring(posArroba).contains("."))
            valido = false;

        System.out.println(valido ? "E-mail válido" : "E-mail inválido");

        sc.close();
    }

    public static void ex8_StringShrink() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a string: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        System.out.println("Compactada: " + sb.toString());

        sc.close();
    }

    public static void ex9_NameFormatter() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nome = sc.nextLine().trim().toLowerCase();

        String[] partes = nome.split("\\s+");

        for (int i = 0; i < partes.length; i++) {
            partes[i] = partes[i].substring(0, 1).toUpperCase() +
                    partes[i].substring(1);
        }

        String sobrenome = partes[partes.length - 1];
        StringBuilder restante = new StringBuilder();

        for (int i = 0; i < partes.length - 1; i++) {
            restante.append(partes[i]).append(" ");
        }

        System.out.println(sobrenome + ", " + restante.toString().trim());

        sc.close();
    }

    public static void runner() {
        Scanner sc = new Scanner(System.in);

        try {
            int opcao;

            do {
                System.out.println(" --- Lista de Exercícios --- ");
                System.out.println("1) ex1_StringComparison()");
                System.out.println("2) ex2_TextAnalyser()");
                System.out.println("3) ex3_PasswordAnalyser()");
                System.out.println("4) ex4_InverterAndPalindromo()");
                System.out.println("5) ex5_Tokenization()");
                System.out.println("6) ex6_WordsFrequency()");
                System.out.println("7) ex7_MailValidator()");
                System.out.println("8) ex8_StringShrink()");
                System.out.println("9) ex9_NameFormatter()");
                System.out.println("0) Sair");
                System.out.println("");
                System.out.println("Informe sua opção:");

                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        ex1_StringComparison();
                        break;
                    case 2:
                        ex2_TextAnalyser();
                        break;
                    case 3:
                        ex3_PasswordAnalyser();
                        break;
                    case 4:
                        ex4_InverterAndPalindromo();
                        break;
                    case 5:
                        ex5_Tokenization();
                        break;
                    case 6:
                        ex6_WordsFrequency();
                        break;
                    case 7:
                        ex7_MailValidator();
                        break;
                    case 8:
                        ex8_StringShrink();
                        break;
                    case 9:
                        ex9_NameFormatter();
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
            } while (opcao != 0);
            System.out.println("Saindo...");

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        sc.close();
    }

    public static void main(String[] args) {
        runner();
    }
}
