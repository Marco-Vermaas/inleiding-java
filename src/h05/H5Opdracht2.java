package h05;

import javax.swing.*;
import java.awt.*;

public class H5Opdracht2 extends JApplet {

    int Valeriegewicht;
    int Jeroengewicht;
    int Hansgewicht;

    public void init() {
        Valeriegewicht = 120;
        Jeroengewicht = 300;
        Hansgewicht = 240;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(400, 500, 500, 50);
        g.fillRect(400, 50, 50, 500);
        g.drawString("0 KG", 355, 500);
        g.drawString("20 KG", 355, 440);
        g.drawString("40 KG", 355, 380);
        g.drawString("60 KG", 355, 320);
        g.drawString("80 KG", 355, 260);
        g.drawString("100 KG", 355, 200);
        g.drawString("120 KG", 355, 140);
        g.drawString("140 KG", 355, 80);
        g.setColor(Color.MAGENTA);
        g.drawString("Valerie", 500, 565);
        g.fillRect(500, 380, 50, Valeriegewicht);
        g.setColor(Color.BLUE);
        g.drawString("Jeroen", 600, 565);
        g.fillRect(600, 200, 50, Jeroengewicht);
        g.setColor(Color.RED);
        g.drawString("Hans", 700, 565);
        g.fillRect(700, 260, 50, Hansgewicht);
    }
}