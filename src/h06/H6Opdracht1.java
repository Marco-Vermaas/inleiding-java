package h06;

import javax.swing.*;
import java.awt.*;

public class H6Opdracht1 extends JApplet {

    double a, b;
    double uitkomst;

    public void init() {
        a = 113.00;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt: " + uitkomst,  20, 20);
        g.drawString("Ali krijgt: " + uitkomst,  20, 35);
        g.drawString("Jeannette krijgt: " + uitkomst,  20, 50);
        g.drawString("Marco krijgt: " + uitkomst,  20, 65);




    }



















}
