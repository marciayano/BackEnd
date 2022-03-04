package A8FacadePattern.service;

import A8FacadePattern.model.Cartao;
import A8FacadePattern.model.Produto;

public interface IFacadeDesconto {
    public int desconto(Cartao cartao, Produto produto, int quantidade);
}
