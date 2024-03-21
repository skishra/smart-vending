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


}
