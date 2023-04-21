package facade.GifWriter;

import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

public interface GifWriter {
    void writeGifToStream(List<BufferedImage> imgs,
                          int delayBetweenFrames,
                          boolean shouldLoopForever,
                          ImageOutputStream imageOutputStream) throws IOException;

}
