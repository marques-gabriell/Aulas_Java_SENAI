package atividades.atividade3;

import java.util.Scanner;

public class CalculadoraComMetodosEncadeados {
    static Scanner entrada = new Scanner(System.in);

    public static int subtrairNumeros(int x, int y) {
        int resultado = x - y;
        return resultado;
    }

    public static void imprimirResultado(int resultado){
        System.out.println("O resultado da operação é: " + resultado);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int x = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int y = entrada.nextInt();

        int resultado = subtrairNumeros(x, y);
        imprimirResultado(resultado);

        entrada.close();


    }
}