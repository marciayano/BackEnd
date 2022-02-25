package A2Mesa;

public class CardapioVegetariano extends Cardapio {
    //atributos
    private double precoEmbalagem;

    //construtor
    public CardapioVegetariano(double precoBase, double precoEmbalagem) {
        super(precoBase);
        this.precoEmbalagem = precoEmbalagem;
    }

    //sobreescrita

    @Override
    public double montar() {
        System.out.println("VEGETARIANO COLOCAR EMBALAGEM ESPECIAL E TEMPERO VEGETARIANO");
        return getPrecoBase() * 1.01 + precoEmbalagem;
    }
}


