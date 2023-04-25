package state.audiplayer;



public class AudioPlayer {


   private Estado estado;

    public AudioPlayer() {
        this.estado = new EnReproduccion(this);
    }

    //Queremos programamr un reproductor de audio
    //Puede tener 3 estados. Reproduciendo / Bloqueado / Pausado
    //Queremos los siguientes métodos, cuya lógica va a variar dependiendo del estado en el que se encuentre
    //La interfaz del MP3 es siempre la misma, pero el comportamiento va a ser distinto dependiendo el estaod
    //Tambien queremos que los metodos cambien el estado del audio player si corresponde (

    //open closed (vamos a tener que tener muchisimos ifs). Queremos que agregar nuevos estados sea facil.
    //single responsability (sino se convierte en una clase con muchisima logica). Estaria bueno leer cada estado x separado.


    public void reproducirCancion(){
       estado.reproducirCancion();

    }

    public void proximaCancion(){
      estado.proximaCancion();;
    }

    public void pausarCancion(){
         estado.pausarCancion();;
    }

    public void bloquearDispositivo(){
     estado.bloquearDispositivo();
    }

    public void desbloquearDispositivo(){
     estado.desbloquearDispositivo();;
    }

    public void actualizar(){
        estado.actualizar();
    }

     void setEstado(Estado estado) {
         this.estado = estado;
     }
}
