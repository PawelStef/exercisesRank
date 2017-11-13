package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame ramka = new JFrame();
        JButton przycisk = new JButton("Kliknij mnie!!");

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.getContentPane().add(przycisk);
        ramka.setSize(200,200);
        ramka.setVisible(true);

    }
}
