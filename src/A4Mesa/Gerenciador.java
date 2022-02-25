package A4Mesa;

public abstract class Gerenciador {
    protected Gerenciador gerenciadorSeguinte;

    //metodo vou buscar o objeto set
    public Gerenciador getSeguinte(){
        return this.gerenciadorSeguinte;
    }

    //set um objeto
    public void setSeguinte(Gerenciador g){
        this.gerenciadorSeguinte = g;
    }

    //metodo abstrado que vai buscar os emails
    public abstract void verificar(Mail mail);

}
