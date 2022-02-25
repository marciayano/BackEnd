package A5ProxyPatterExerc2Service;

import java.util.Date;

public class ServicoVacinar implements Vacinar {

    @Override
    public void vacinarPessoa(String RG, Date dataVacina, String tipoVacina) {
        System.out.println("Usuario(a) "+ RG + " vacinado(a) em "+
                dataVacina+ " com sucesso.");
    }
}
