package com.designpattern.strategy;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter){
        compressor.compress(fileName);
        filter.apply(fileName);

        System.out.println("Image stored successfully");
    }
}
