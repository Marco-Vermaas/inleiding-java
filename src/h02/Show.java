package h02;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;


public class Show extends Applet {


    public void init() {
      setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Welcome to Java", 50, 60);
    }

}