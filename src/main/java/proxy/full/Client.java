package proxy.full;

public class Client {



    public static void main(String[] args) {


        System.out.println("-----------------without proxy-------------------");

        //without proxy
        PostRepository postRepository = new PostRepositoryImpl();
        String post = postRepository.getPost("1");

        System.out.println("-----------------logging proxy-------------------");

        //using logging proxy
        postRepository = new LoggingPostRepositoryProxy();
        post = postRepository.getPost("1");


        System.out.println("-----------------caching proxy-------------------");

        //using caching proxy
        postRepository = new CachingPostRepositoryProxy();
        post = postRepository.getPost("1");
        post = postRepository.getPost("1");
        post = postRepository.getPost("1");
        post = postRepository.getPost("1");
        post = postRepository.getPost("1");
        post = postRepository.getPost("2");




    }
}
