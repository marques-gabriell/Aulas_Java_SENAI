import java.util.Scanner;

import static java.lang.System.out;

public class PrimeiraAula {
    public static void main(String[] args){
        String nome = "Gabriel";
        int idade = 28;
        boolean desenvolvedor = true;

        int anoNascimento = 2026 - idade;

        out.println(nome);
        out.println(idade);
        out.println(desenvolvedor);
        out.println(anoNascimento);

        Scanner entrada = new Scanner(System.in);

        nome = entrada.nextLine();
        System.out.println(nome);
    }
}
