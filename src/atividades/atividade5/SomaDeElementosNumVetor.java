package atividades.atividade5;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaDeElementosNumVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declarado vetores
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        String[] nomes = new String[]{
                "João", "Ithalo", "Daniel"
        };

        //foreach
        for (int numero : numeros) {
            System.out.println(numero);
        }




            entrada.nextLine();

    }
}
