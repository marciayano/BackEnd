package A4ChainOfResponsability;

public class Main {
    public static void main(String[] args) {

        FuncionarioBanco handlerBase = new ExecutivoDeConta().setSeguinteFuncionario(new Gerente().setSeguinteFuncionario(new Diretor()));

        handlerBase.processarSolicitacao(2000);

    }
}
