package h06;

import javax.swing.*;
import java.awt.*;

public class H6Opdracht2 extends JApplet {

    int sec_in_min;
    int a, b, c;

    public void init() {
        sec_in_min = 60;
        a = 60;
        b = 24;
        c = 365;
    }

    public void paint(Graphics g) {
        g.drawString("seconden in uur: " + sec_in_min*a, 20, 20);
        g.drawString("seconden in dag: " + sec_in_min*a*b, 20, 35);
        g.drawString("seconden in jaar: " + sec_in_min*a*b*c, 20, 50);
    }
}
