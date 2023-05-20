package facade.live.code;

import facade.live.image_processing_library.ImageCache;
import facade.live.image_processing_library.ImageColourFilter;
import facade.live.image_processing_library.ImageProcessor;
import facade.live.image_processing_library.ImageType;
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

    public ImageService(ImageType type, ImageColourFilter colourFilter, ImageCache imageCache, Path path, ImageRepository imageRepository, Logger logger) {
        this.type = type;
        this.colourFilter = colourFilter;
        this.imageCache = imageCache;
        this.path = path;
        this.imageRepository = imageRepository;
        this.logger = logger;
    }

    private Logger logger;



    public BufferedImage processImage(BufferedImage bufferedImage){

        List<BufferedImage> imageList = imageRepository.loadImage(path.toString());

        boolean valid = validateImages(imageList);
        if (!valid){
            throw new RuntimeException("Imagenes no validas");
        }

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

    private boolean validateImages(List<BufferedImage> imageList) {
        //chequea que las imagenes sean validas de acuerdo a cierta logica de negocio
        return true;
    }


    public List<BufferedImage> getImages(String path){
        logger.info("Get images");
        return imageRepository.loadImage(path);

    }

    public void saveImages(List<BufferedImage> images){
        logger.info("Saving images");
        imageRepository.saveImages(images);
    }




}
