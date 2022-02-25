package A2Mesa;

public class CardapioInfantil extends Cardapio{
    //atributos
    private double valorBrinquedo;

    //construtor
    public CardapioInfantil(double precoBase, double valorBrinquedo) {
        super(precoBase);
        this.valorBrinquedo = valorBrinquedo;
    }

    //sobreescrita
    @Override
    public double montar(){
        System.out.println("PEDIDO COM BRINQUEDO");
        return getPrecoBase() + valorBrinquedo;
    }
}