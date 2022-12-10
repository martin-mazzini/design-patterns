package state;

public class LockedState implements AudioPlayerState {


    public void playNextSong(AudioPlayer player) {
        System.out.println("Cannot play next song in locked state.");
    }

    public void playPreviousSong(AudioPlayer player) {
        System.out.println("Cannot play previous song in locked state.");
    }

    public void startPlayback(AudioPlayer player) {
        System.out.println("Cannot start playback in locked state");
    }


    public void stopPlayback(AudioPlayer player) {
        System.out.println("Cannot stop playback in locked state");
    }

    public void lock(AudioPlayer player) {
        System.out.println("Already locked.");
    }

    public void unlock(AudioPlayer player) {
        // Unlock the audio player
        System.out.println("Unlocking audio player...");
        player.setState(new ReadyState());
    }

    @Override
    public String getName() {
        return "Locked";
    }

}
