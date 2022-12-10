package state;

public interface AudioPlayerState {
    void playNextSong(AudioPlayer player);
    void playPreviousSong(AudioPlayer player);
    void startPlayback(AudioPlayer player);
    void stopPlayback(AudioPlayer player);
    void lock(AudioPlayer player);
    void unlock(AudioPlayer player);
    String getName();
}
