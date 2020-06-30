package com.designpattern.iterator;


public class Main {
    public static void main(String[] args){
        BrowseHistory history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

       /* for (String url: history.getUrls()) {
            System.out.println(url);
        }*/

        Iterator iterator = history.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
