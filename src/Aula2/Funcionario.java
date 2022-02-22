package Aula2;

public abstract class Funcionario {
    //Atributos
    //como sao mesmo tipo podemos usar a virgula
    private String nome, sobrenome, numeroConta;

    //Contrutor
    public Funcionario(String nome, String sobrenome, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }

    //Metodo
    public void pagamentoSalario(){
        double quantia;
        quantia = calcularSaldo();
        imprimirRecibo(quantia);
        depositar(quantia);
    }

    //criar interface (metodo abstrato) para ser chamado dentro da classe
    public abstract double calcularSaldo();
    public abstract void imprimirRecibo(double quantia);
    public abstract void depositar(double quantia);
}
