package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by zorenkoav on 01.06.2017.
 */
public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes types) {
        if(types == ImageTypes.BMP) return new BmpReader();
        if(types == ImageTypes.JPG) return new JpgReader();
        if(types == ImageTypes.PNG) return new PngReader();
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
