package com.skrahaman.FlavorDatabase;

import java.util.Iterator;

public class TreeIterator<E> implements Iterator<E> {
    private Iterator<E> iterator;

    public TreeIterator(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public E next() {
        if (hasNext())
            return iterator.next();
        else return null;
    }
}
