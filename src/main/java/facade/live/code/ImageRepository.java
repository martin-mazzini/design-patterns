package facade.live.code;

import java.awt.image.BufferedImage;
import java.util.List;

public interface ImageRepository {
    List<BufferedImage> loadImages(String path);

    void saveImages(List<BufferedImage> images);

    BufferedImage loadImage(String path);
}
