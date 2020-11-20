package src.path;

import src.shape.Shapes;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {

    private Shapes shape;

    public void setShape(Shapes shape){
        this.shape = shape;
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if(shape !=null)
            shape.draw(graphics);
    }

}
