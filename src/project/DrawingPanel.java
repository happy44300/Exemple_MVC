package project;

import project.shape.Shapes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * This class represent the panel on witch the shape are drawn
 */
public class DrawingPanel extends JPanel {

    /**
     * the model linked to this drawing panel
     */
    private final Model model;

    /**
     * Creates a new DrawingPanel
     * @param model The model this DrawingPanel will be linked to
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
