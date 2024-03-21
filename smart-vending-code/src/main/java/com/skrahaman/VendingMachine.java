package com.skrahaman;

public class VendingMachine {
    private LinkedQueue[][] slots;

    public VendingMachine(int numRows, int numColumns) {
        slots = new LinkedQueue[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                slots[i][j] = new LinkedQueue<Snack>();
            }
        }
    }

    public void addSnack(int row, int column, Snack snack) {
        // add a way to force add to the same stack, no mix matching snacks in the same stack, hash?
        slots[row][column].enqueue(snack);
    }
}
