package com.skrahaman;

import java.util.Arrays;

public class VendingMachine {
    private SlotQueue[][] slots;
    public int numRows;
    public int numColumns;

    public VendingMachine(int numRows, int numColumns) {
        slots = new SlotQueue[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                slots[i][j] = new SlotQueue();
            }
        }
        this.numRows = numRows;
        this.numColumns = numColumns;
    }

    public void restock(Snack snack, int row, int column) {
        if (row <= numRows && column <= numColumns) {
            slots[row][column].enqueue(snack);
        }
    }

    public Snack vend(int row, int column) {
        return slots[row][column].dequeue();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                sb.append(slots[i][j].toString());
            }
        }
        return sb.toString();
    }
}
