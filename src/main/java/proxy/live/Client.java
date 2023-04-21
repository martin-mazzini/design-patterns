package proxy.live;

public class Client {



    public static void main(String[] args) {

        PostRepository postRepository = new PostRepositoryImpl();
        Service service = new Service(new PostRepositoryTimedProxy(new PostRepositoryImpl()));
        service.procesar();



    }



}
