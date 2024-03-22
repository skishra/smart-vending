package com.skrahaman;

public class SlotArrayQueue {
    private Snack[] array;
    private Snack designatedSnack;
    private int front = 0;
    private int size = 0;

    public SlotArrayQueue(int depth) {
        this.array = new Snack[depth];
    }

    public Snack first() {
        return array[front];
    }

    public void enqueue(Snack snack) {
        if (size() == 0) {
            designatedSnack = snack;
            int index = (front + size) % array.length;
            array[index] = snack;
            size++;
        } else if (designatedSnack.toString().equals(snack.toString()) && size() <= array.length) {
            int index = (front + size) % array.length;
            array[index] = snack;
            size++;
        }
    }

    public Snack dequeue() {
        if (isEmpty()) {
            return null;
        }

        Snack temp = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size--;

        if (size() == 0) {
            designatedSnack = null;
        }
        return temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                sb.append(String.format("[%20s] ", array[i].toString()));
            } else {
                sb.append(String.format("[%20s] ", ""));
            }

        }
        return sb.toString();
    }
}
