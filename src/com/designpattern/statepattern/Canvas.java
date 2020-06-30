package com.designpattern.statepattern;

public class Canvas {
    public static void main(String[] args) {
        View textView = new View(new TextView());
        View editText = new View(new EditText());

        textView.onDraw();
        editText.onDraw();
    }
}
