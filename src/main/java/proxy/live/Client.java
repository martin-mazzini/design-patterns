package proxy.live;

public class Client {



    public static void main(String[] args) {

        PostRepositoryImpl postRepository = new PostRepositoryImpl();
        Service service = new Service(postRepository);
        service.procesar();



    }



}
