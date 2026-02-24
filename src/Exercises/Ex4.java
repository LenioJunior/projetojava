package Exercises;

import java.util.Scanner;

public class Ex4 {

    /*
        Inversor de String. Leia uma palavra ou frase e exiba:
        A string invertida.
        Se ela é um palíndromo (desconsiderando espaços e maiúsculas/minúsculas).
        Métodos sugeridos: charAt(), toLowerCase()
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        String invertida = "";
        boolean isPalindromo = false;

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        String originalSemEspacos = palavra.replace(" ", "");
        String invertidaSemEspacos = invertida.replace(" ", "");

        if (originalSemEspacos.equalsIgnoreCase(invertidaSemEspacos)) {
            isPalindromo = true;
        }

        String message = String.format("Palavra Invertida: %s.", invertidaSemEspacos);
        if(isPalindromo){
            System.out.println("Palíndromo");
        } else {
            System.out.println("Não Palíndromo");
        }

        System.out.println(message);

        sc.close();
    }
}
