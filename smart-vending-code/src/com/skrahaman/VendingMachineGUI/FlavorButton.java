package com.skrahaman.VendingMachineGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class FlavorButton extends JButton implements ActionListener {
    public String leftOrRight;
    public void actionPerformed(ActionEvent e) {

    }

    FlavorButton(String leftOrRight, int x, int y) {
        this.leftOrRight = leftOrRight;
        start(x, y);
    }
    private void start(int x, int y) {
        setBounds(x,y,250,150);
    }
}
