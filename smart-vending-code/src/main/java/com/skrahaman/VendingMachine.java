package com.skrahaman;

public class VendingMachine {
    private SlotQueue[][] slots;

    public VendingMachine(int numRows, int numColumns) {
        slots = new SlotQueue[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                slots[i][j] = new SlotQueue();
            }
        }
    }

    public void restock(String name, double price, int row, int column) {
        slots[row][column].enqueue(new Snack(name, price));
    }

    public Snack vend(int row, int column) {
        return slots[row][column].dequeue();
    }
}
