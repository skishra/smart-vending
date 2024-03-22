package com.skrahaman;

public class VendingMachine {
    private SlotArrayQueue[][] slots;
    private int numRows;
    private int numColumns;
    private int depth;

    public VendingMachine(int numRows, int numColumns, int depth) {
        slots = new SlotArrayQueue[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                slots[i][j] = new SlotArrayQueue(depth);
            }
        }

        this.numRows = numRows;
        this.numColumns = numColumns;
        this.depth = depth;
    }

    public void restock(Snack snack, int row, int column) {
        if (row <= numRows && column <= numColumns && slots[row][column].size() <= depth) {
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
            sb.append("\n");
        }
        return sb.toString();
    }
}
