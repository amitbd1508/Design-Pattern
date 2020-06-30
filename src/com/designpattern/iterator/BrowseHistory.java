package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    // If we change inside this class it will affect the caller class 
    // Think of a tv remote controller , If manufacture change inside the circuit, the buttons remain same  
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        int lastIndex = urls.size()-1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return  lastUrl;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator{
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Object current() {
            return history.urls.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }
    }
}
