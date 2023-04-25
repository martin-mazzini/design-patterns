package state.audiplayer;

public class Bloqueado implements Estado {


    private final AudioPlayer audioPLayer;

    public Bloqueado(AudioPlayer audioPlayer) {
        this.audioPLayer = audioPlayer;
    }

    @Override
    public void reproducirCancion() {
        System.out.println("NO SE PUEDE ESTA BLOQUEADO");
    }

    @Override
    public void proximaCancion() {

    }

    @Override
    public void pausarCancion() {

    }

    @Override
    public void bloquearDispositivo() {

    }

    @Override
    public void desbloquearDispositivo() {

    }

    @Override
    public void actualizar() {

    }
}
