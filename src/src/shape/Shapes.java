package src.shape;

import java.awt.*;

/**
 * Interface for all object implementing a shape
 */
public interface Shapes {

    /**
     * Draw this src.shape
     * @param graphic The graphic context drawn on
     */
    void draw(Graphics graphic);

    /**
     * Move this src.shape to the desired position
     *
     * @param position The new point to move to
     */
    void moveTo(Point position);

    /**
     * Rotate this src.shape by the desired angle
     *
     * @param angle the angle to rotate in degrees between 0 and 360
     */
    void rotate(int angle);

    /**
     * Gets the color of a src.shape
     *
     * @return This src.shape color
     */
    Color getColor();

    /**
     * Change the color of a src.shape
     *
     * @param color The new color of the src.shape
     */
    void setColor(Color color);
}
