package com.designpattern.statepattern;

public class View {
    private State state;

    public View(State state) {
        this.state = state;
    }

    public void onDraw() {
        state.onDraw();
    }
}
