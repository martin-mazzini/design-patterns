package facade.live.code;

import facade.live.image_processing_library.ImageCache;
import facade.live.image_processing_library.ImageColourFilter;
import facade.live.image_processing_library.ImageProcessor;
import facade.live.image_processing_library.ImageType;

import java.awt.image.BufferedImage;
import java.nio.file.Path;

public class ImageProcessingFacade {


    private ImageType type;
    private ImageColourFilter colourFilter;
    private ImageCache imageCache;
    private Path path;

    public ImageProcessingFacade(ImageType type, ImageColourFilter colourFilter, ImageCache imageCache, Path path) {
        this.type = type;
        this.colourFilter = colourFilter;
        this.imageCache = imageCache;
        this.path = path;
    }

    public BufferedImage filterRedColor(BufferedImage bufferedImage) {
        ImageProcessor imageProcessor = new ImageProcessor();
        imageProcessor.setImageType(type);
        imageProcessor.setFilter(colourFilter);

        try {
            imageProcessor.configureImageProcessor(90, bufferedImage.getWidth(), bufferedImage.getHeight());
        } catch (Exception e) {
            e.printStackTrace();
        }

        imageProcessor.readImage(bufferedImage);
        imageProcessor.setCache(imageCache);
        imageProcessor.setLoadPath(path);

        BufferedImage processedImage = imageProcessor.processImage();
        return processedImage;
    }
}
