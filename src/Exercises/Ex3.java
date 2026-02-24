package Exercises;

import java.util.Scanner;

public class Ex3 {

    /*
        Verificador de Senha. Leia uma senha do teclado e valide se ela:
        Possui no mínimo 8 caracteres.
        Contém pelo menos uma letra maiúscula.
        Contém pelo menos um número.
        Contém pelo menos um caractere especial.
        Exiba quais critérios foram atendidos e se a senha é válida.
        Métodos sugeridos: 
            charAt(), Character.isDigit(), Character.isUpperCase(), 
            Character.isLetterOrDigit() e Character.isLetter()
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = sc.nextLine();

        boolean tamanho = false;
        boolean letraMaiuscula = false;
        boolean letraMinuscula = false;
        boolean numero = false;
        boolean especial = false;

        tamanho = senha.length() >= 8;

        char[] letras = senha.toCharArray();
        
        for (char letra : letras) {
            if(Character.isUpperCase(letra))
                letraMaiuscula = true;

            if(!Character.isUpperCase(letra) && !Character.isDigit(letra))
                letraMinuscula = true;

            if(Character.isDigit(letra))
                numero = true;

            if(!Character.isLetterOrDigit(letra))
                especial = true;
        }

        if (tamanho && letraMinuscula && letraMaiuscula && numero && especial){
            System.out.println("Senha Válida!");
        } else {
            if(!tamanho)
                System.out.println("Tamanho Inválido!");
            
            if(!letraMinuscula)
                System.out.println("Faltou letra minúscula!");

            if(!letraMaiuscula)
                System.out.println("Faltou letra maíuscula!");
            
            if(!numero)
                System.out.println("Faltou número!");

            if(!especial)
                System.out.println("Faltou caracter especial!");
        }

        sc.close();
    }
}
