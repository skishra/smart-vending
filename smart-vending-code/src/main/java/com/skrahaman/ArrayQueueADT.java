package com.skrahaman;

import java.util.Arrays;

public class ArrayQueueADT<E> {
    private static final int DEFAULTLENGTH = 100;
    private E[] array;
    private int front = 0;
    private int size = 0;

    public ArrayQueueADT() {
        array = (E[]) new Object[DEFAULTLENGTH];
    }

    public ArrayQueueADT(int length) {
        array = (E[]) new Object[length];
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return array[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(E e) {
        if (size() != array.length) {
            int index = (front + size) % array.length;
            array[index] = e;
            size++;
        }
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E temp = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size--;
        return temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
