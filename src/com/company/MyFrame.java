package com.company;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
    private Application app;
    private JComboBox<String> comboBox;


    public MyFrame(Application application) {
    super("Combo box");
    this.app = application;
    setVisible(true);
    setSize(400, 300);

    String[] choice = {"first", "second", "third"};
    this.comboBox = new JComboBox<>(choice);
    add(comboBox, BorderLayout.BEFORE_FIRST_LINE);

    comboBox.addActionListener((ActionEvent e) ->
            System.out.println(comboBox.getSelectedItem()));
    }

}
