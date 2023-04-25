package facade.live.image_processing_library;

import java.awt.image.BufferedImage;
import java.nio.file.Path;
import java.util.List;

public class ImageProcessor {

    private ImageType imageType;
    private List<ImageColourFilter> imageColourFilterList;
    private ImageCache imageCache;
    private Path path;


    public void configureImageProcessor(int quality, int imageWidth, int imageLength) throws Exception{


    }

    public void readImage(BufferedImage bufferedImage){

    }


    public BufferedImage processImage(){

        return null;
    }


    public void setFilter(ImageColourFilter imageColourFilter){
        this.imageColourFilterList = imageColourFilterList;
    }

    public void setImageType(ImageType imageType){
        this.imageType = imageType;
    }


    public void setCache(ImageCache imageCache) {

        this.imageCache = imageCache;
    }

    public void setLoadPath(Path path) {

        this.path = path;
    }
}
