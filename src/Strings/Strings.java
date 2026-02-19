package Strings;

public class Strings {

    public static void main(String[] args) {
        String palavra = "Engenharia";
        String area = palavra.substring(0, 3);
        System.out.println(String.format("'%s'", area));

        System.out.println();
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" POO");
        sb.append(" utilizando");
        sb.append(" Java");
        System.out.println(sb);
    }
}
