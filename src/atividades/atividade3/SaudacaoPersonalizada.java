package atividades.atividade3;

import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static void imprimirSaudacao(String nome) {
        System.out.println("Olá, " + nome + "! \nBem vindo a nossa aula de métodos.");
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();

        imprimirSaudacao(nome);


        entrada.close();
    }
}