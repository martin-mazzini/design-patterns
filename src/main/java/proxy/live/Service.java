package proxy.live;

public class Service {


    private PostRepository postRepository;

    public Service(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void procesar(){
        //hace cosas

        String post = postRepository.getPost("1");

        //hace otras cosas

    }

}
