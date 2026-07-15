package atividades.atividade4;

import java.util.Scanner;

public class SistemaDeCofreDigital {

    public static void abrirCofre() {
        Scanner entrada = new Scanner(System.in);

        int codigo = 0;
        int tentativa = 0;

        while (tentativa < 5 && codigo != 9999) {
            System.out.println("Digite o código do cofre: ");
            codigo = entrada.nextInt();

            if (codigo == 9999) {
                System.out.println("Cofre Aberto!");
            } else {
                tentativa++;
                if (tentativa < 5) {
                    System.out.println("Código errado. Restam " + (5 - tentativa) + " tentativas.");
                } else {
                    System.out.println("Cofre Bloqueado");
                }

            }
        }

        entrada.close();
    }

    public static void main(String[] args) {
        abrirCofre();
    }
}