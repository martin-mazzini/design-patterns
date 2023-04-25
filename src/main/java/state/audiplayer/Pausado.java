package state.audiplayer;

public class Pausado implements Estado {


    private final AudioPlayer audioPlayer;

    public Pausado(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void reproducirCancion() {
        System.out.println("Empezando a reproducir canci´n");
        audioPlayer.setEstado(new EnReproduccion(audioPlayer));
    }

    @Override
    public void proximaCancion() {
        System.out.println("Empezando a reproducir proxima cancion");
        audioPlayer.setEstado(new EnReproduccion(audioPlayer));
    }

    @Override
    public void pausarCancion() {
        System.out.println("Ya está pausado");
    }

    @Override
    public void bloquearDispositivo() {
        System.out.println("Bloqueando el dispositivo");
        audioPlayer.setEstado(new Bloqueado(audioPlayer));
    }

    @Override
    public void desbloquearDispositivo() {

    }

    @Override
    public void actualizar() {

    }
}
