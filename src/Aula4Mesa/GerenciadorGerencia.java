package Aula4Mesa;

public class GerenciadorGerencia extends Gerenciador{
    @Override
    public void verificar(Mail email){
        if ((email.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Gerencia"))){
            System.out.println("Enviado ao departamento da Gerencia");
        }
        else {
            if (this.getSeguinte()!=null){
                this.getSeguinte().verificar(email);
            }
        }
    }//fecha o metodo
}//fecha a classe
