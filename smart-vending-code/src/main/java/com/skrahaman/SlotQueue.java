package com.skrahaman;

public class SlotQueue {
    private LinkedQueue<Snack> list;
    private Snack designatedSnack;

    public SlotQueue() {
        list = new LinkedQueue<>();
    }

    public Snack first() {
        return list.first();
    }

    public void enqueue(Snack snack) {
        if (size() == 0) {
            list.enqueue(snack);
            designatedSnack = snack;

        } else if (designatedSnack.toString().equals(snack.toString())) {
            list.enqueue(snack);
        }
    }

    public Snack dequeue() {
        Snack temp = list.dequeue();
        if (size() == 0) {
            designatedSnack = null;
        }
        return temp;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
