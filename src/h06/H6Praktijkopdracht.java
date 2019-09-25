package h06;

import javax.swing.*;
import java.awt.*;

public class H6Praktijkopdracht extends JApplet {

    double a, b, c, uitkomst, afronden;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a+b+c)/3;
        afronden = (Math.round(uitkomst*10)/10);
    }


    public void paint(Graphics g) {
        g.drawString("gemiddelde: " + uitkomst, 20, 20);



    }
}
