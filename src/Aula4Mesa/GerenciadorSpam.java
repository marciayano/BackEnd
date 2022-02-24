package Aula4Mesa;

public class GerenciadorSpam extends Gerenciador{
    @Override
    public void verificar(Mail email){
            System.out.println("Cai fora: SPAM!!!");
    }//fecha o metodo
}//fecha a classe
