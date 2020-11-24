package src;

import src.shape.Shapes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * This class represent the panel on witch the shape are drawn
 */
public class DrawingPanel extends JPanel {


    /**
     * the currently selected shape to draw
     */
    private ArrayList<Shapes> _shapeList = new ArrayList<>();

    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     */

    /**
     *  Set the currently drawn shape
     * @param shape the new shape to be drawn
     */
    public void addShape(Shapes shape){
        this._shapeList.add(shape);
    }

    /**
     * clear the list of displayed shape
     */
    public void voidClearShape(){
        _shapeList.clear();
    }

    /**
     * Draw the shape assigned to this component
     * @param graphics The graphic context drawn on
     */
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for(Shapes shape : _shapeList) {
            if (shape != null)
                shape.draw(graphics);
        }
    }

}
