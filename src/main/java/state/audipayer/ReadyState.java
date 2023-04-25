package state.audipayer;

public class ReadyState implements AudioPlayerState {
    public void playNextSong(AudioPlayer player) {
        System.out.println("Playing next song...");
        player.setState(new PlayingState());
    }

    public void playPreviousSong(AudioPlayer player) {
        System.out.println("Playing previous song...");
        player.setState(new PlayingState());
    }

    public void startPlayback(AudioPlayer player) {
        System.out.println("Starting playback...");
        player.setState(new PlayingState());
    }

    public void stopPlayback(AudioPlayer player) {
        System.out.println("Cannot stop playback in ready state...not playing");
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
        return "Ready";
    }
}
