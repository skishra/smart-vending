package com.skrahaman;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VendingMachine machine = new VendingMachine();
                new VendingMachineGUI(machine);
            }
        });
    }
}