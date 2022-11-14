package com.tokioschool.componentsylisteners.view;

import javax.swing.*;
import java.awt.*;

public class DataPanel extends JPanel {

    private JTabbedPane tabbedPane;
    private JPanel customerPanel;
    private JPanel orderPanel;
    private JPanel providersPanel;

    public DataPanel() {
        setLayout(new GridLayout(3, 2));
        initComponents();
    }

    private void initComponents() {
        customerPanel = new JPanel();
        customerPanel.add(new JButton("Ok"));
        customerPanel
        orderPanel = new JPanel();
        providersPanel = new JPanel();

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Clientes", customerPanel);
        tabbedPane.addTab("Pedidos", orderPanel);
        tabbedPane.addTab("Proveedores", providersPanel);
        add(tabbedPane);
    }
}
