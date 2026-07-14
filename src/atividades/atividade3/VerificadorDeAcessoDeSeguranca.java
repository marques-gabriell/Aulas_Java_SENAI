package atividades.atividade3;

import java.util.Scanner;

public class VerificadorDeAcessoDeSeguranca {
    public static void verificarMaioridade(int idade) {
        System.out.println("Idade: " + idade + "! \n");
    }

    public static boolean maioridade(int resultado){
        if(resultado >= 18){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();

        if(maioridade(idade)){
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Acesso Negado");
        }


        entrada.close();
    }


}
