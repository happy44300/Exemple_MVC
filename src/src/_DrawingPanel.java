package src;

import src.shape.Shapes;

import javax.swing.*;
import java.awt.*;

/**
 * This class represent the panel on witch the shape are drawn
 */
public class _DrawingPanel extends JPanel {


    /**
     * the currently selected shape to draw
     */
    private Shapes _shape;

    /**
     * is the object trail enabled;
     */
    private boolean _displayTrails = false;

    /**
     *  Set the currently drawn shape
     * @param shape the new shape to be drawn
     */
    public void setShape(Shapes shape){
        this._shape = shape;
    }

    /**
     * paint
     * @param graphics The graphic context drawn on
     */
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if(_shape !=null)
            _shape.draw(graphics);
    }

}
