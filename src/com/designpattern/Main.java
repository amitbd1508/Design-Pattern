package com.designpattern;

import com.designpattern.statepattern.EditText;
import com.designpattern.statepattern.TextView;
import com.designpattern.statepattern.View;

public class Main {

    public static void main(String[] args) {
        View textView = new View(new TextView());
        View editText = new View(new EditText());

        textView.onDraw();
        editText.onDraw();
    }
}
