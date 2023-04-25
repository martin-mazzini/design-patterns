package state.audipayer;

public class PlayingState implements AudioPlayerState {


    public void playNextSong(AudioPlayer player) {

        System.out.println("Playing next song...");
    }

    public void playPreviousSong(AudioPlayer player) {
        System.out.println("Playing previous song...");
    }

    public void startPlayback(AudioPlayer player) {
        System.out.println("Playback already in progress.");
    }

    public void stopPlayback(AudioPlayer player) {
        System.out.println("Stopping playback...");
        player.setState(new ReadyState());
    }

    public void lock(AudioPlayer player) {
        System.out.println("Locking audioplayer.");
        player.setState(new LockedState());
    }

    public void unlock(AudioPlayer player) {
        System.out.println("Doing nothing.. Player is not locked...");
    }

    @Override
    public String getName() {
        return "Playing";
    }
}
