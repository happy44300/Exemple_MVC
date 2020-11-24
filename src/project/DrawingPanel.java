package project;

import project.shape.Shapes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * This class represent the panel on witch the shape are drawn
 */
public class DrawingPanel extends JPanel {

    private Model model;

    /**
     * Creates a new DrawingPanel
     */
    public DrawingPanel(Model model) {
        this.model = model;
    }

    /**
     * Draw the shape assigned to this component
     * @param graphics The graphic context drawn on
     */
    public void paintComponent(Graphics graphics) {
            if (model.getShape() != null)
                model.getShape().draw(graphics);
    }

}
