package com.company;

import javax.swing.*;
import java.awt.event.*;

public class ProstyGUI1b implements ActionListener {
    JButton przycisk;

    //public static void main(String[] args) {

        //ProstyGUI1b apGUI = new ProstyGUI1b();
       // apGUI.doDziela();
   // }

    public void doDziela() {
        JFrame ramka = new JFrame();
        przycisk = new JButton("Kliknij mnie!!");

        przycisk.addActionListener(this);

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.getContentPane().add(przycisk);
        ramka.setSize(300, 300);
        ramka.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent zdarzenie) {
        przycisk.setText("Zostałem kliknięty");
    }
}