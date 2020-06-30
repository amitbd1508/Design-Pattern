package com.designpattern.statepattern;

public class TextView implements State{

    @Override
    public void onDraw() {
        System.out.println("Text view draw");
    }
}
