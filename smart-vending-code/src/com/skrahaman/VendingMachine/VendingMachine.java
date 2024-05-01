package com.skrahaman.VendingMachine;

import com.skrahaman.FlavorDatabase.BinarySearchTree;

import java.util.Arrays;

public class VendingMachine {
    private SlotLinkedQueue[][] slots;
    private int numRows;
    private int numColumns;
    private int depth;

    public VendingMachine(int numRows, int numColumns, int depth) {
        slots = new SlotLinkedQueue[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                slots[i][j] = new SlotLinkedQueue(depth);
            }
        }

        this.numRows = numRows;
        this.numColumns = numColumns;
        this.depth = depth;
    }

    public void restock(Snack snack, int quantity, int row, int column) {
        for (int i = 0; i < quantity; i++) {
            if (row <= numRows && column <= numColumns && slots[row][column].size() <= depth) {
                slots[row][column].enqueue(snack);
            }
        }
    }
    public Snack vend(String snackName) {
        int[] rowAndColumn = getDigits(find(snackName));
        vend(rowAndColumn[0], rowAndColumn[1]);
    }

    private int find(String snackName) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (slots[i][j].first().getName().equalsIgnoreCase(snackName)) {
                    return (i*10)+j;
                }
            }
        }
    }

    private static int[] getDigits(int number) {
        String numStr = String.valueOf(number);

        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        return digits;
    }

    private Snack vend(int row, int column) {
        return slots[row][column].dequeue();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public SlotLinkedQueue[][] getSlots() {
        return slots;
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
