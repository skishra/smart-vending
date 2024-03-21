package com.skrahaman;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class SlotQueue {
    private LinkedList<Snack> linkedList = new LinkedList<>();
    private Snack designatedSnack;

    public SlotQueue() {
    }

    public Snack first() {
        return linkedList.getFirst();
    }

    public void enqueue(Snack snack) {
        if (size() == 0) {
            linkedList.add(snack);
            designatedSnack = snack;

        } else if (designatedSnack.toString().equals(snack.toString())) {
            linkedList.add(snack);
        }
    }

    public Snack dequeue() {
        Snack temp = linkedList.removeLast();
        if (size() == 0) {
            designatedSnack = null;
        }
        return temp;
    }

    public int size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return Arrays.toString(linkedList.toArray());
    }
}
