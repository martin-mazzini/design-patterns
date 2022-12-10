package state;

public class Client {


    public static void main(String[] args) {


        AudioPlayer audioPlayer = new AudioPlayer(new ReadyState());

        audioPlayer.playNextSong();
        audioPlayer.playNextSong();
        audioPlayer.unlock();
        audioPlayer.lock();
        audioPlayer.stopPlayback();
        audioPlayer.startPlayback();
        audioPlayer.unlock();
        audioPlayer.startPlayback();
        audioPlayer.stopPlayback();
    }
}
