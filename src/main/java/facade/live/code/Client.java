package facade.live.code;

import facade.live.image_processing_library.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.image.BufferedImage;
import java.nio.file.Path;

public class Client {


    public static void main(String[] args) {


        ImageService imageService =
                new ImageService(ImageType.JPG, new ImageColourFilter(Colour.RED), new ImageCache(), Path.of("/directory/images"),
                new ImageRepositoryImpl(), LoggerFactory.getLogger("ImageService"));


    }



}
