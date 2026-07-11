import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome completo?");
        String nome = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual a sua altura?");
        double altura = entrada.nextDouble();

        entrada.nextLine(); // Limpa o buffer

        System.out.println("Qual o seu cargo?");
        String cargo = entrada.nextLine();

        System.out.println("Qual o período que estuda no SENAI?");
        String periodo = entrada.nextLine();

        System.out.println(
                "\nSuas informações:" +
                        "\nNome: " + nome +
                        "\nIdade: " + idade +
                        "\nAltura: " + altura +
                        "\nCargo: " + cargo +
                        "\nPeríodo: " + periodo
        );

        entrada.close();
    }
}