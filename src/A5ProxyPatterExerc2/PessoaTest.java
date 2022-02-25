package A5ProxyPatterExerc2;

import A5ProxyPatterExerc2Service.ServicoVacinarProxy;
import A5ProxyPatterExerc2Service.Vacinar;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    //pegando data do sistema
    Date dataVac = new Date();

    //uso ela aqui
    @Test
    public void vac(){
        Pessoa p1 = new Pessoa("Christh", "Teixeira", "1122334455", dataVac, "Pfizer");
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRG(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1.toString());
    }

}