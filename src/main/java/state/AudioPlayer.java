package state;

/**
 * Context
 */
public class AudioPlayer  {

    private AudioPlayerState audioPlayerState;

    public AudioPlayer(AudioPlayerState audioPlayerState) {
        this.audioPlayerState = audioPlayerState;
    }

    public void setState(AudioPlayerState state) {
        System.out.println("Chaning state to: " + state.getName());
        this.audioPlayerState = state;
    }


 
    public void playNextSong() {
        audioPlayerState.playNextSong(this);
    }

 
    public void playPreviousSong() {

        audioPlayerState.playPreviousSong(this);
    }

 
    public void startPlayback() {
        audioPlayerState.startPlayback(this);
    }

 
    public void stopPlayback() {
        audioPlayerState.stopPlayback(this);
    }

 
    public void lock() {
        audioPlayerState.lock(this);
    }

 
    public void unlock() {
        audioPlayerState.unlock(this);
    }
}
