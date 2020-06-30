package com.designpattern.iterator;

public interface Iterator<T> {
    void next();
    T current();
    boolean hasNext();
}
