package atividades.atividade2;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Informe seu peso?");
        double peso = entrada.nextInt();

        System.out.println(
                "\nSeu peso é:" + peso
        );

        System.out.println("Informe sua altura?");
        double altura = entrada.nextInt();

        System.out.println(
                "\nSua altura é:" + altura
        );


        double IMC = peso / (altura * altura);

        System.out.println(
                "\nSeu IMC é:" + IMC
        );





        entrada.close();
    }
}
