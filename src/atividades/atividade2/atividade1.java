package atividades.atividade2;

import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Informe sua idade?");
        int idade = entrada.nextInt();



        System.out.println(
                "\nSuas informações:" +
                        "\nIdade: " + idade
        );

        if ( idade < 16) {
            System.out.println("Você não pode VOTAR.");
        }
        if ( idade == 16 || idade == 17 || idade >= 70) {
            System.out.println("Seu VOTO é facultativo.");
        } else {
            System.out.println("Seu VOTO é obrigatório.");
        }

        entrada.close();
    }
}