package h06;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class H6Opdracht3 extends JApplet {

    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 2147483547;
        b = 2147483547;
        uitkomst = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("positief getal1 + positief getal2 = negatief getal: " + uitkomst, 20, 20);
    }
}
