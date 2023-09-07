package com.openbootcamp.facade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade conversor = new VideoConversionFacade();
        File mp4Video = conversor.convertVideo("fichero.ogg", "mp4");
    }
}
