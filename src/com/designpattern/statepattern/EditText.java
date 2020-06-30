package com.designpattern.statepattern;

public class EditText implements State {
    @Override
    public void onDraw() {
        System.out.printf("Edit text");
    }
}
