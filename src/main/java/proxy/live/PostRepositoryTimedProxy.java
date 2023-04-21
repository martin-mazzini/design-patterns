package proxy.live;

public class PostRepositoryTimedProxy implements PostRepository {



    private PostRepository postRepository;

    public PostRepositoryTimedProxy(PostRepositoryImpl postRepository) {
    }

    public String getPost(String postId){
        if (postRepository == null){
            postRepository = new PostRepositoryImpl();
        }
        long start = System.currentTimeMillis();
        String post = postRepository.getPost(postId);
        long finall = System.currentTimeMillis();
        System.out.println(finall-start);
        return post;
    }


}
