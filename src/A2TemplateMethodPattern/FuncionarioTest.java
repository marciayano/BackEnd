package A2TemplateMethodPattern;

import org.junit.jupiter.api.Test;

class FuncionarioTest {

    @Test
    void Calculos(){

        Funcionario func = new Efetivo("Odair", "Antunes", "55201", 3000.0, 1000.0, 500.0);

        func.pagamentoSalario();

        func = new Contratado("Marlene", "Peixoto", "41528", 50.0,50);

        func.pagamentoSalario();

    }

}