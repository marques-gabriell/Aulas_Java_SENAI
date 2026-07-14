package atividades.atividade3;

import java.util.Scanner;

public class MaquinaDoDobro {
    public static void calcularDobro(int numero) {
        System.out.println("Você digitou o número: " + numero + "! \n");
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = entrada.nextInt();

        calcularDobro(numero);

        int dobro = numero * 2;

        System.out.println(
                "\nO dobro do número digitado é: " + dobro
        );

        entrada.close();
    }
}

