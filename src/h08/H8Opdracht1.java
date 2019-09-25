package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class H8Opdracht1 extends Applet {

    Button knop1;
    Button knop2;
    TextField tekstvak;
    String s;
    String c;
    Label label;

    public void init() {
        tekstvak = new TextField("", 20);
        add(tekstvak);
        label = new Label("Typ iets in het tekstvak");
        add(label);

        knop1 = new Button();
        knop1.setLabel("ok");
        KnopListener kl = new KnopListener();
        knop1.addActionListener( kl );
        add(knop1);

        knop2 = new Button();
        knop2.setLabel("reset");
        knop2.addActionListener(new ResetKnopListener());
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString(s,200, 250);
    }

    class KnopListener implements ActionListener {
            public void actionPerformed( ActionEvent e) {
                s = tekstvak.getText();
                repaint();
            }
    }

    class ResetKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            tekstvak.setText("");
        }
    }
}