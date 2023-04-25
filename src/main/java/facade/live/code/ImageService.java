package facade.live.code;

import facade.live.image_processing_library.*;
import org.slf4j.Logger;

import java.awt.image.BufferedImage;
import java.nio.file.Path;
import java.util.List;

public class ImageService {


    private ImageType type;
    private ImageColourFilter colourFilter;
    private ImageCache imageCache;
    private Path path;
    private ImageRepository imageRepository;
    private Logger logger;

    public ImageService(ImageType type, ImageColourFilter colourFilter, ImageCache imageCache, Path path, ImageRepository imageRepository, Logger logger) {
        this.type = type;
        this.colourFilter = colourFilter;
        this.imageCache = imageCache;
        this.path = path;
        this.imageRepository = imageRepository;
        this.logger = logger;
    }

    public BufferedImage processImage(BufferedImage bufferedImage){


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


    public List<BufferedImage> getImages(String path){
        logger.info("Listing images");
        return imageRepository.loadImage(path);

    }

    public List<BufferedImage> listImages(String path, Integer pageNumber, Integer pageSize){
        logger.info("Listing images");
        return imageRepository.loadImages(path);

    }


    public void saveImages(List<BufferedImage> images){
        logger.info("Saving images");
        imageRepository.saveImages(images);
    }




}
