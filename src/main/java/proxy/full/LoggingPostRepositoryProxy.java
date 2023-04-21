package proxy.full;

import java.util.logging.Logger;

public class LoggingPostRepositoryProxy implements PostRepository{


    private PostRepositoryImpl postRepository = new PostRepositoryImpl();

    private static final Logger logger = Logger.getLogger(LoggingPostRepositoryProxy.class.getName());

    @Override
    public String getPost(final String postId) {

        logger.info("Calling getPost method");

        // Record the start time
        long startTime = System.currentTimeMillis();

        String post = postRepository.getPost(postId);

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate the execution time
        long executionTime = endTime - startTime;

        // Log the result and the execution time
        logger.info("getPost method returned: " + post + " (execution time: " + executionTime + "ms)");

        return post;
    }
}
