package Aula2;

public class Contratado extends Funcionario{
    //Atributos
    private double valorHora;
    private int horas;

    //super para criar construtor (para construir o objeto)
    public Contratado(String nome, String sobrenome, String numeroConta, double valorHora, int horas) {
        super(nome, sobrenome, numeroConta);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    //sobreescrita
    @Override
    public double calcularSaldo() {
        return valorHora * horas;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerado um recibo - Funcio. CONTRATADO");
    }

    @Override
    public void depositar (double quantia){
        System.out.println("Foi depositado uma quantia de " + quantia);
    }
}
