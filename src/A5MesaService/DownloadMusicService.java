package A5MesaService;

public class DownloadMusicService implements DownloadMusic{

    @Override
    public void download(String typeUser) {
        System.out.println( "User: " + typeUser + ", Musica retornada");
    }
}
