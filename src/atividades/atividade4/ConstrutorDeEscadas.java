package atividades.atividade4;

import java.util.Scanner;

public class ConstrutorDeEscadas {
    public static void desenharEscada(int degraus, char simbolo){
        for (int i = 1; i <= degraus; i++)

            for(int j = 1; j <= i; j++) {
                System.out.println(simbolo);
        }
        System.out.println();
    }
    public static void main(String[] agrs){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de degraus: ");
        int degraus = entrada.nextInt();

        System.out.println("Informe o símbolo: ");
        char simbolo = entrada.next().charAt(0);

        desenharEscada(degraus, simbolo);

        entrada.close();
    }
}

