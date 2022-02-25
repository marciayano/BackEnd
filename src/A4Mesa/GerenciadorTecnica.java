package A4Mesa;

public class GerenciadorTecnica extends Gerenciador{
    @Override
    public void verificar(Mail email){
        if ((email.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Tecnica"))){
            System.out.println("Enviado ao departamento da Tecnica");
        }
        else {
            if (this.getSeguinte()!=null){
                this.getSeguinte().verificar(email);
            }
        }
    }//fecha o metodo
}//fecha a classe
