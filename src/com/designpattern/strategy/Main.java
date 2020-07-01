package com.designpattern.strategy;


import com.designpattern.iterator.BrowseHistory;
import com.designpattern.iterator.Iterator;

public class Main {
    public static void main(String[] args){
        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store("DemoImage.png",  new JPEGCompressor(), new BWFilter());
        imageStorage.store("DemoImage.png",  new PNGCompressor(), new RedFilter());
        imageStorage.store("DemoImage.png",  new PNGCompressor(), new BWFilter());
    }
}
