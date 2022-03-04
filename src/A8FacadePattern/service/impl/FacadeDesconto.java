package A8FacadePattern.service.impl;

import A8FacadePattern.model.Cartao;
import A8FacadePattern.model.Produto;
import A8FacadePattern.service.IFacadeDesconto;

public class FacadeDesconto implements IFacadeDesconto {
    //armazenar as variaveis para as instancias (utilizar as apis)
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FacadeDesconto() {
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    //A utilizacao das APIs para os calculos dos descontos
    public int desconto (Cartao cartao, Produto produto, int quantidade){
        int desconto =0;
        desconto += apiQuantidade.desconto(quantidade);
        desconto += apiProduto.desconto(produto);
        desconto += apiCartao.desconto(cartao);
        return desconto;
    }

}
