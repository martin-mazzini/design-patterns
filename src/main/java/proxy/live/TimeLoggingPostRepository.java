package proxy.live;

public class TimeLoggingPostRepository implements PostRepository{


    PostRepositoryImpl postRepository = new PostRepositoryImpl();

    @Override
    public String getPost(String postId) {
        long start = System.currentTimeMillis();
        String post = postRepository.getPost(postId);
        System.out.println(System.currentTimeMillis() - start);
        return post;
    }
}
