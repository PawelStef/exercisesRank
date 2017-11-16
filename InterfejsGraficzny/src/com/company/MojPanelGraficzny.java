package com.company;
import javax.swing.*;
import java.awt.*;

public class MojPanelGraficzny extends JPanel {
    public void paintComponent(Graphics g){
        g.setColor(Color.PINK);
        g.fillRect(20,50,100,100);
    }

}
