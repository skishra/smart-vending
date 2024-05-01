package com.skrahaman.VendingMachineGUI;

import com.skrahaman.VendingMachine.VendingMachine;

import javax.swing.*;

public class VendingMachineFrame extends JFrame {
    protected VendingMachine vendingMachine;

    VendingMachineFrame(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        start();
    }

    private void start() {
    }
}
