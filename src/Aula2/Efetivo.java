package Aula2;

public class Efetivo extends Funcionario {
    //atributos
    private double salarioBase;
    private double descontos;
    private double bonificacoes;

    //super para criar construtor (para construir o objeto)
    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double descontos, double bonificacoes) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;
    }

    //sobreescrita
    @Override
    public double calcularSaldo() {
        return salarioBase + bonificacoes - descontos;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerado um recibo - Funcio. EFETIVO");
    }

    @Override
    public void depositar (double quantia){
        System.out.println("Foi depositado uma quantia de " + quantia);
    }
}
