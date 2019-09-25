package h04;

import javax.swing.*;
import java.awt.*;

public class H4Opdracht4 extends JApplet {

public void paint(Graphics g) {
  g.setColor(Color.MAGENTA);
  g.fillRect(500, 380, 50, 120);
  g.setColor(Color.BLUE);
  g.fillRect(600, 200, 50, 300);
  g.setColor(Color.RED);
  g.fillRect(700, 260, 50, 240);
  g.setColor(Color.BLACK);
  g.fillRect(400, 500, 500, 50);
  g.setColor(Color.BLACK);
  g.fillRect(400, 50, 50, 500);
  g.setColor(Color.MAGENTA);
  g.drawString("Valerie", 500, 565);
  g.setColor(Color.BLUE);
  g.drawString("Jeroen", 600, 565);
  g.setColor(Color.RED);
  g.drawString("Hans", 700, 565);
  g.setColor(Color.BLACK);
  g.drawString("0 KG", 355, 500);
  g.drawString("20 KG", 355, 440);
  g.drawString("40 KG", 355, 380);
  g.drawString("60 KG", 355, 320);
  g.drawString("80 KG", 355, 260);
  g.drawString("100 KG", 355, 200);
  g.drawString("120 KG", 355, 140);
  g.drawString("140 KG", 355, 80);

        }
}
