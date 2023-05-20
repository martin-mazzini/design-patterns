package proxy.live;

public class Client {



    public static void main(String[] args) {

        //Queremos modifivar el postRepository para que loguie el tiempo de ejecucion del request
        //No queremos tocar su codigo fuente, (separacion de responsabilidades)
        //O no podemos (si es una libreria)
        //Queremos que sea facil volver a la version sin logging

        PostRepositoryImpl postRepository = new PostRepositoryImpl();
        Service service = new Service(postRepository);
        service.procesar();



    }



}
