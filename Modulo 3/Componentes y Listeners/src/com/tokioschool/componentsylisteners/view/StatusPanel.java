package com.tokioschool.componentsylisteners.view;

import javax.swing.*;
import java.awt.*;

public class StatusPanel extends JPanel {
    private JLabel lbStatus;

    public StatusPanel() {
        setLayout(new BorderLayout());
        initComponents();
    }

    public JLabel getLbStatus() {
        return lbStatus;
    }

    private void initComponents() {
        lbStatus = new JLabel("Barra de estado", SwingConstants.LEFT);
        add(lbStatus);
    }
}
