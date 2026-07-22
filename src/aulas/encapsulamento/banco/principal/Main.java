package aulas.encapsulamento.banco.principal;

import aulas.encapsulamento.banco.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Gabriel", 123456);
        minhaConta.setTitular("Felipe");
        System.out.println(minhaConta.getTitular());

        minhaConta.depositar(100);

        ContaBancaria pessoa1 = new ContaBancaria("Gabriel");
        ContaBancaria pessoa2 = new ContaBancaria("Marcos");
        ContaBancaria pessoa3 = new ContaBancaria("Isabella");

        pessoa1.depositar(100);
        pessoa2.sacar(1000);
        pessoa3.depositar(100);
        pessoa3.sacar(10);

        System.out.println("A pessoa "+pessoa1.getTitular()+" depositou ");
        pessoa1.depositar(100);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}