package com.tokioschool.layouts.view;

import javax.swing.*;
import java.awt.*;

public class DataPanel extends JPanel {
    private JLabel lbName;
    private JLabel lbSurname;
    private JLabel lbCategory;
    private JTextField tfName;
    private JTextField tfSurname;
    private JComboBox<String> cbCategory;

    public DataPanel() {
        setLayout(new GridLayout(3, 2));
        initComponents();
    }

    public JLabel getLbName() {
        return lbName;
    }

    public JLabel getLbSurname() {
        return lbSurname;
    }

    public JLabel getLbCategory() {
        return lbCategory;
    }

    public JTextField getTfName() {
        return tfName;
    }

    public JTextField getTfSurname() {
        return tfSurname;
    }

    public JComboBox<String> getCbCategory() {
        return cbCategory;
    }

    private void initComponents() {
        lbName = new JLabel("Nombre");
        lbSurname = new JLabel("Apellidos");
        lbCategory = new JLabel("Categoria");
        tfName = new JTextField();
        tfSurname = new JTextField();
        cbCategory = new JComboBox<>();
        cbCategory.addItem("Junior");
        cbCategory.addItem("Midler");
        cbCategory.addItem("Senior");
        add(lbName);
        add(tfName);
        add(lbSurname);
        add(tfSurname);
        add(lbCategory);
        add(cbCategory);
    }
}
