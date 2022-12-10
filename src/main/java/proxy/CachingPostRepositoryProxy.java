package proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class CachingPostRepositoryProxy implements PostRepository {

    // Initialize the cache
    private Map<String, String> cache = new HashMap<>();

    private PostRepositoryImpl postRepository = new PostRepositoryImpl();

    private static final Logger logger = Logger.getLogger(LoggingPostRepositoryProxy.class.getName());

    @Override
    public String getPost(final String postId) {
        // Check the cache
        long currentTime = System.currentTimeMillis();
        if (cache.containsKey(postId)) {
            // Return the cached result if it is less than an hour old
            logger.info("Returning cached result for getPost method");
            return cache.get(currentTime);
        } else {
            // Log the method call

            // Call the original method
            String post = postRepository.getPost(postId);

            // Update the cache
            cache.put(postId, post);

            return post;
        }
    }
}
