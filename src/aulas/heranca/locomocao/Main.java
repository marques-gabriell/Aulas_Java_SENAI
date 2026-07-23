package aulas.heranca.locomocao;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto motoEletrica = new MotoEletrica();
        Moto motoACombustao = new MotoACombustao();

        carro.setNomeVeiculo("Celtinha");
        carro.ligar();
        carro.ligarArCondionado();

        motoEletrica.abastecer();;
        motoACombustao.abastecer();
    }
}
