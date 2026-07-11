package atividades.Atividade2;

import java.util.Scanner;

public class atividade3 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);


            System.out.println("Informe um número?");
            int numero = entrada.nextInt();


            System.out.println(
                    "\nO número informado é:" + numero
            );


            if (numero < 0) {
                System.out.println("O número é Negativo");
            } else {
                System.out.println("O número é Positivo");
            }

            if (numero % 2 == 0) {
                System.out.println("O número é Par");
            } else {
                System.out.println("O número é Ímpar");
            }

            entrada.close();
        }
    }
