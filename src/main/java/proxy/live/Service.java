package proxy.live;

public class Service {


    private PostRepositoryImpl postRepository;

    public Service(PostRepositoryImpl postRepository) {
        this.postRepository = postRepository;
    }

    public void procesar(){
        //hace cosas

        String post = postRepository.getPost("1");

        //hace otras cosas

    }

}
