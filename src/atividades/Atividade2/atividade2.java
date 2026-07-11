package atividades.Atividade2;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Informe a primeira Nota?");
        double media = entrada.nextInt();


        System.out.println(
                "\nPrimeira Nota registrada:" + media
        );

        System.out.println("Informe a segunda Nota?");
        double media1 = entrada.nextInt();


        System.out.println(
                "\nSegunda Nota registrada:" + media1
        );

        System.out.println("Informe a terceira Nota?");
        double media2 = entrada.nextInt();

        double mediatotal = (media + media1 + media2) /3;

        System.out.println(
                "\nTerceira Nota registrada:" + media2 +
                     "\n\nSua média calculada é:" +  mediatotal
        );

        if (mediatotal < 7) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("APROVADO");
        }



        entrada.close();
    }
}
