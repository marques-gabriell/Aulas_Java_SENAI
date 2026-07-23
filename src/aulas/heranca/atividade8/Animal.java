package aulas.heranca.atividade8;

public class Animal {
    private String aves;
    private String mamiferosCarnivoros;
    private String mamiferosHerbivoros;
    private String primatas;
    private String repteis;
    private String peconhentos;
    private String aquaticos;
    private String especiesDoCerrado;
    private String ameacados;
    private String nome;
    private String emitirSom;

    public void emitirSom(){
        System.out.println(nome+ "Emite o som: "+emitirSom);
    }

    public void comer(){
        System.out.println(nome+ "Esta comendo");
    }
    public void arara(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getEmitirSom(){
        return emitirSom;
    }


}
