package com.tokioschool.componentsylisteners.view;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public ButtonPanel() {
        setLayout(new FlowLayout());
        initComponents();
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton4() {
        return button4;
    }

    private void initComponents() {
        button1 = new JButton("Registrar");
        button2 = new JButton("Modificar");
        button3 = new JButton("Eliminar");
        button4 = new JButton("Buscar");

        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }
}
