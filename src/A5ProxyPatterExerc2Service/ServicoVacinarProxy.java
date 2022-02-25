package A5ProxyPatterExerc2Service;

import java.util.Date;

public class ServicoVacinarProxy implements Vacinar{
    @Override
    public void vacinarPessoa(String RG, Date dataVacina, String tipoVacina) {
        if (dataVacina.before(new Date())){
            ServicoVacinar servicoVacinar = new ServicoVacinar();
            servicoVacinar.vacinarPessoa(RG, dataVacina, tipoVacina);
            System.out.println("Cidadao(a) vacinado(a).");
        }else {
            System.out.println("A data de hoje e anterior a data marcada.");
        }
    }
}
