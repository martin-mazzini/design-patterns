package facade.GifWriter;

import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

public class GifWriterImpl implements GifWriter {

    public void writeGifToStream(List<BufferedImage> srcImages, int delayBetweenFrames, boolean shouldLoopForever, ImageOutputStream output) throws IOException {
        BufferedImage firstImage = srcImages.get(0);
        GifSequenceWriter writer = new GifSequenceWriter(output,
                firstImage.getType(), delayBetweenFrames, shouldLoopForever);
        for (BufferedImage img : srcImages) {
            writer.writeToSequence(img);
        }
        writer.close();
        output.close();
    }



}

