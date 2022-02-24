package Aula4Mesa;

public class Programa {
    public static void main(String[] args) {
        CheckMail verificaMail = new CheckMail();
        verificaMail.verificar(new Mail("email@email.com","tecnica@dh.com.br","Reclamacao"));
        verificaMail.verificar(new Mail("email@email.com","sds@dh.com.br","Gerencia"));
        verificaMail.verificar(new Mail("email@email.com","sds@dh.com.br","Tecnica"));
        verificaMail.verificar(new Mail("email@email.com","chris@dh.com.br","comercial"));
    }
}
