package com.skrahaman.VendingMachine;

import java.util.Arrays;
import java.util.LinkedList;

public class SlotLinkedQueue {
    private LinkedList<Snack> linkedList = new LinkedList<>();
    private int depth;
    private Snack designatedSnack;

    public SlotLinkedQueue(int depth) {
        this.depth = depth;
    }

    public Snack first() {
        return linkedList.getFirst();
    }

    public void enqueue(Snack snack) {
        if (size() != depth) {
            if (size() == 0) {
                designatedSnack = snack;
                linkedList.add(snack);
            } else if (designatedSnack.toString().equals(snack.toString())) {
                linkedList.add(snack);
            }
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
