
package oop_project;


import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private Drawable[] shapes;
    public DrawPanel(Drawable[] shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int x = 50;
        int y = 50;

        for (Drawable d : shapes) {
            if (d instanceof Circle) {
                Circle c = (Circle) d;
                int r = (int) c.getRadius();

                g2.setColor(Color.blue);
                g2.drawOval(x, y, r * 2, r * 2);
                //كتابه المعلومات
                g2.drawString("Circle", x+r*2+20, y+10);
                g2.drawString("Radius: "+c.getRadius(),x+r*2+20, y+25);
                g2.drawString("Area: " +c.getArea(), x+r*2+20, y+40);

                y += r * 2 + 30;
            } else if (d instanceof Cube) {
                Cube c = (Cube) d;
                int size = (int) c.getSide();
                int depth = size / 3;

                g2.setColor(Color.RED);

                // الوجه الأمامي
                g2.drawRect(x, y, size, size);
                // الوجه الخلفي
                g2.drawRect(x + depth, y - depth, size, size);

                // خطوط الربط
                g2.drawLine(x, y, x + depth, y - depth);
                g2.drawLine(x + size, y, x + size + depth, y - depth);
                g2.drawLine(x, y + size, x + depth, y + size - depth);
                g2.drawLine(x + size, y + size, x + size + depth, y + size - depth);

                //كتابه المعلومات
                g2.drawString("Cube", x+size+20, y);
                g2.drawString("Side: "+c.getSide(), x+size+20, y+15);
                g2.drawString("Area: "+c.getArea(), x+size+20, y+32);
                y += size + 50;
            }
        }
    }
}
