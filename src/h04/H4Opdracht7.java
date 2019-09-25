package h04;

import javax.swing.*;
import java.awt.*;

public class H4Opdracht7 extends JApplet {

public void paint(Graphics g) {
g.drawRoundRect(20, 20, 220, 220, 20, 20);
g.setColor(Color.BLACK);
g.fillArc(70, 70, 20, 20, 0, 360);
g.fillArc(170, 70, 20, 20, 0, 360);
g.fillArc(70, 170, 20, 20, 0, 360);
g.fillArc(170, 170, 20, 20, 0, 360);
    }
}
