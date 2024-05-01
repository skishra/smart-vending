package com.skrahaman.VendingMachineGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonPanel extends JPanel {
    public FlavorButton flavor1 = new FlavorButton() {
        @Override
        public void actionPerformed(ActionEvent e) {
            super.actionPerformed(e);
        }
    };

    public FlavorButton flavor2 = new FlavorButton() {
        @Override
        public void actionPerformed(ActionEvent e) {
            super.actionPerformed(e);
        }
    };
}
