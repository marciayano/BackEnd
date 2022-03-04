package A8FacadePattern.service.impl;

import A8FacadePattern.model.Cartao;

public class ApiCartao {
    public int desconto(Cartao cartao){
        if (cartao.getBanco().compareTo("Star Bank")==0){
            return 20;
        }else{
            return 0;
        }

    }
}
