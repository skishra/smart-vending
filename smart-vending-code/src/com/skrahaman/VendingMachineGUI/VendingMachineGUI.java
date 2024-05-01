package com.skrahaman.VendingMachineGUI;

import com.skrahaman.VendingMachine.Chips;
import com.skrahaman.VendingMachine.VendingMachine;

import javax.swing.*;

public class VendingMachineGUI extends JFrame {
    protected VendingMachine vendingMachine;

    VendingMachineGUI(int numRows, int numColumns, int depth) {
        this.vendingMachine = new VendingMachine(numRows, numColumns, depth);
    }
}
