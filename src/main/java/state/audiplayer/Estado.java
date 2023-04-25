package state.audiplayer;

public interface Estado {



    public void reproducirCancion();

    public void proximaCancion();

    public void pausarCancion();

    public void bloquearDispositivo();

    public void desbloquearDispositivo();


    public void actualizar();
}
