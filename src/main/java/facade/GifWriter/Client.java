package facade.GifWriter;

import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Client {



    public void main(String[] args) throws Exception {

        List<BufferedImage> frames = new ArrayList<>();
        ImageOutputStream imageOutputStream = new FileImageOutputStream(new File("src/test/java/lambda/imageprocessing/testresults/gifgeneration" +"fileName" + ".gif"));
        GifWriterImpl gifWriter = new GifWriterImpl();
        gifWriter.writeGifToStream(frames, 300, true, imageOutputStream);


    }
}
