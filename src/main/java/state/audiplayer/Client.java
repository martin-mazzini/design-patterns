package state.audiplayer;

public class Client {


    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        //en estado en reproducción
        audioPlayer.reproducirCancion();
        audioPlayer.proximaCancion();
        //a partir de acá esta pausado
        audioPlayer.pausarCancion();
        audioPlayer.pausarCancion();
        audioPlayer.reproducirCancion();
        //a partir de acá volvemos a en reproducción
        audioPlayer.bloquearDispositivo();
        //a partir de acá quedo bloqueado
        audioPlayer.reproducirCancion();




    }
}
