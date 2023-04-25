package state.audiplayer;

public class EnReproduccion implements Estado {


    private final AudioPlayer audioPlayer;

    public EnReproduccion(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void reproducirCancion() {
        System.out.println("El MP3 ya está reproduciendo música");
    }

    @Override
    public void proximaCancion() {
        System.out.println("Pasando a la siguiente canción");
    }

    @Override
    public void pausarCancion() {
        System.out.println("Pausando la reproducción");
        audioPlayer.setEstado(new Pausado(audioPlayer));
    }

    @Override
    public void bloquearDispositivo() {
        System.out.println("Bloqueando el dispositivo");
        audioPlayer.setEstado(new Bloqueado(audioPlayer));

    }

    @Override
    public void desbloquearDispositivo() {
        System.out.println("No tiene sentido desbloquear en un MP3 que está pausado");

    }

    @Override
    public void actualizar() {

    }
}
