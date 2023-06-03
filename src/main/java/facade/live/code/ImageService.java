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


    private ImageProcessingFacade facade;
    private Logger logger;
    private ImageRepository imageRepository;


    public ImageService(ImageProcessingFacade facade, ImageRepository imageRepository, Logger logger) {
        this.facade = facade;
        this.imageRepository = imageRepository;
        this.logger = logger;
    }


    public BufferedImage processImage(Long id){

        BufferedImage bufferedImage = imageRepository.loadImage(id.toString());

        boolean valid = validateImages(bufferedImage);
        if (!valid){
            throw new RuntimeException("Imagenes no validas");
        }

        BufferedImage processedImage = facade.filterRedColor(bufferedImage);
        return processedImage;
    }






    private boolean validateImages(BufferedImage imageList) {
        //chequea que las imagenes sean validas de acuerdo a cierta logica de negocio
        return true;
    }



    public void saveImages(List<BufferedImage> images){
        logger.info("Saving images");
        imageRepository.saveImages(images);
    }




}
