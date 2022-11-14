package com.tokioschool.componentsylisteners.view;

import javax.swing.*;

public class JFrameBoxLayout extends JFrame {
    private JButton btDeleteName;
    private JButton btQuit;
    private JTextField tfName;
    private JPanel panel;

    public JFrameBoxLayout() {
        super();
        initComponents();
        configureJFrame();
    }

    private void initComponents() {
        panel = new JPanel();
        /*
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        */
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        getContentPane().add(panel);

        btDeleteName = new JButton("Borrar Nombre");
        btDeleteName.addActionListener(e -> {
            tfName.setText("");
        });
        btQuit = new JButton("Salir");
        btQuit.addActionListener(e -> {
            if (JOptionPane.showConfirmDialog(null, "¿Estas seguro de salir?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
                return;

            System.exit(0);
        });
        tfName = new JTextField(50);

        panel.add(btDeleteName);
        panel.add(btQuit);
        panel.add(tfName);
    }

    private void configureJFrame() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
