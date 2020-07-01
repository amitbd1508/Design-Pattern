package com.designpattern.strategy;

public class BWFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W Filter");
    }
}
