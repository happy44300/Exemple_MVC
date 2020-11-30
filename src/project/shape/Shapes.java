package project.shape;

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
    Color get_color();

    /**
     * Change the color of a src.shape
     *
     * @param _color The new color of the src.shape
     */
    void set_color(Color _color);

    /**
     * Get the rotation of a shape
     * @return this shape rotation
     */
    int getRotation();

    /**
     * Return true the point is in this shape
     * @param point The point to test
     * @return a boolean representing if the point is in this shape
     */
    boolean contain(Point point);

}
