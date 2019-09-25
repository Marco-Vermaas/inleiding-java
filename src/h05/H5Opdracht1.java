package h05;

import javax.swing.*;
import java.awt.*;

public class H5Opdracht1 extends JApplet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        g.drawLine(100, 75, 300, 75);
        g.drawRect(100, 100, breedte, hoogte);
        g.drawOval(625, 250, 100, 100);
        g.drawArc(575, 100, breedte, hoogte, 0, 360);
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.fillArc(575, 100, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
    }
}