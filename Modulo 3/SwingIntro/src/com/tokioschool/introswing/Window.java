package com.tokioschool.introswing;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JButton btDeleteName;
    private JButton btQuit;
    private JTextField tfName;

    public Window() {
        setLayout(new FlowLayout());

        initComponents();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
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

        getContentPane().add(btDeleteName);
        getContentPane().add(btQuit);
        getContentPane().add(tfName);
    }
}
