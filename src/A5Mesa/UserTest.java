package A5Mesa;

import A5MesaService.DownlaodMusicServiceProxy;
import A5MesaService.DownloadMusic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void downloadTestPremium(){
        User user = new User(1, "Premium");
        DownloadMusic downloadMusic = new DownlaodMusicServiceProxy();

        downloadMusic.download(user.getTypeUser());
    }

    @Test
    public void downloadTestFree(){
        User user = new User(1, "Free");
        DownloadMusic downloadMusic = new DownlaodMusicServiceProxy();

        downloadMusic.download(user.getTypeUser());
    }

}