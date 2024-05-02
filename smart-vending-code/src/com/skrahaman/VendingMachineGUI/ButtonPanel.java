package com.skrahaman.VendingMachineGUI;

import com.skrahaman.FlavorDatabase.TreeNode;
import com.skrahaman.VendingMachine.VendingMachine;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonPanel extends JPanel {
    public TreeNode<String> snackFlavorRootNode = VendingMachine.flavorTree.getRoot();
    public FlavorButton left = new FlavorButton(100, 50) {
        @Override
        public void actionPerformed(ActionEvent e) {
            super.actionPerformed(e);
        }
    };

    public FlavorButton right = new FlavorButton(300, 50) {
        @Override
        public void actionPerformed(ActionEvent e) {
            super.actionPerformed(e);
        }
    };
}
