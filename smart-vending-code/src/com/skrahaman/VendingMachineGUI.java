package com.skrahaman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VendingMachineGUI {
    public final JFrame frame;
    public final JLabel currentLabel;
    public final JButton leftButton;
    public final JButton rightButton;
    public final JButton resetButton;
    public final TreeNode rootNode;
    public TreeNode currentNode;

    public VendingMachineGUI(VendingMachine machine) {
        frame = new JFrame("Vending Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(285, 150);
        frame.setResizable(false);

        currentNode = machine.root;
        rootNode = machine.root;
        currentLabel = new JLabel("Choose a Category:");
        leftButton = new JButton(currentNode.left.toString());
        rightButton = new JButton(currentNode.right.toString());
        resetButton = new JButton("Reset");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(currentLabel, BorderLayout.NORTH);
        panel.add(leftButton, BorderLayout.WEST);
        panel.add(rightButton, BorderLayout.EAST);
        panel.add(resetButton, BorderLayout.SOUTH);

        frame.add(panel);

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentNode.left != null) {
                    currentNode = currentNode.left;
                    updateButtons();
                }
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentNode.right != null) {
                    currentNode = currentNode.right;
                    updateButtons();
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetToRoot();
            }
        });

        frame.setVisible(true);
    }

    private void updateButtons() {
        currentLabel.setText("Subcategory: " + currentNode);
        if (currentNode.left != null) {
            if (currentNode.left.data.isRealSnack) {
                currentLabel.setText("You got: " + currentNode.left + "!");
                leftButton.setVisible(false);
                rightButton.setVisible(false);
            } else {
                leftButton.setText(currentNode.left.toString());
                leftButton.setVisible(true);
            }
        } else {
            leftButton.setText("N/A");
            leftButton.setVisible(false);
        }

        if (currentNode.right != null) {
            if (currentNode.right.data.isRealSnack) {
                currentLabel.setText("You got: " + currentNode.right + "!");
                rightButton.setVisible(false);
                leftButton.setVisible(false);
            } else {
                rightButton.setText(currentNode.right.toString());
                rightButton.setVisible(true);
            }
        } else {
            rightButton.setText("N/A");
            rightButton.setVisible(false);
        }

    }

    private void resetToRoot() {
        currentNode = rootNode;
        updateButtons();
        currentLabel.setText("Choose a Category:");
    }
}