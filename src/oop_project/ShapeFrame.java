
package oop_project;

import javax.swing.*;

public class ShapeFrame extends JFrame {

    public ShapeFrame(Drawable[] shapes) {
        setTitle("Shapes Drawing");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new DrawPanel(shapes));
        setVisible(true);
    }
}