package com.designpattern.strategy;

public class RedFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Red Filter");
    }
}
