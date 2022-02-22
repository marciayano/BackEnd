package Aula2Mesa;

public class CardapioAdulto extends Cardapio {

    public CardapioAdulto(double precoBase) {
        super(precoBase);
    }

    @Override
    public double montar() {
        System.out.println("Este pedido NÃO contem itens adicionais.");
        return getPrecoBase();
    }

}
