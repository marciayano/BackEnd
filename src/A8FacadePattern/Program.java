package A8FacadePattern;

import A8FacadePattern.model.Cartao;
import A8FacadePattern.model.Produto;
import A8FacadePattern.service.impl.FacadeDesconto;


public class Program {
    public static void main(String[] args) {
        FacadeDesconto facade = new FacadeDesconto();
        Cartao cartao = new Cartao("123456", "Star Bank");
        Produto produto = new Produto("Lasanha", "Lata");
        System.out.println("Desconto concedido: "+ facade.desconto(cartao, produto,15)+"%");
    }
}
