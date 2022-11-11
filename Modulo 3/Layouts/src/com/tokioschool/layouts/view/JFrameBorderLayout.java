package com.tokioschool.layouts.view;

import javax.swing.*;
import java.awt.*;

public class JFrameBorderLayout extends JFrame {
    private JPanel buttonsPanel;
    private JPanel dataPanel;
    private JPanel statusPanel;

    public JFrameBorderLayout() {
        super();
        initComponents();
        configureJFrame();
    }

    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }

    public JPanel getDataPanel() {
        return dataPanel;
    }

    public JPanel getStatusPanel() {
        return statusPanel;
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        buttonsPanel = new ButtonPanel();
        dataPanel = new DataPanel();
        statusPanel = new StatusPanel();

        add(buttonsPanel, BorderLayout.NORTH);
        add(dataPanel, BorderLayout.CENTER);
        add(statusPanel, BorderLayout.SOUTH);
    }

    private void configureJFrame() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
