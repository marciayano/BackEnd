package A4ChainOfResponsability;

public class Gerente extends FuncionarioBanco{
    @Override
    public void processarSolicitacao(Integer quantia) {
        if (quantia >= 60000 && quantia <= 200000)
            System.out.println("Eu estou encarregado de administrar isso. Gerente");
        else if (this.seguinteFuncionario != null)
            this.seguinteFuncionario.processarSolicitacao(quantia);
    }
}
