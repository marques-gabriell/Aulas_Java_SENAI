package aulas.encapsulamento.banco.modelo;

public class ContaBancaria {
    //Atributos dessa classe
    private String titular;
    private int numeroDaConta;
    private double saldo;

    //Contrutor dessa classe
    public ContaBancaria(String titular, int numeroDaConta){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void  depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println(valor+" foi depositado");
        } else {
            System.out.println("Erro: valor inválido");
        }
    }
    public void sacar(double valor){
        if (this.saldo > valor){
            this.saldo -= valor;
            System.out.println(valor+" foi retirado da conta");
        }
    }

    private String acessarTodosOsDados(){
        return this.titular;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }

}

