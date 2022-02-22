package Aula2Mesa;

public abstract class Cardapio {
    //Atributos
    private double precoBase;

    //construtor
    public Cardapio(double precoBase) {
        this.precoBase = precoBase;
    }

    //Metodo
    public double getPrecoBase() {
        return precoBase;
    }
    public void calcularPreco(){
        System.out.println("O preco final é: " + montar());
    }

    //Interface
    public abstract double montar();

}
