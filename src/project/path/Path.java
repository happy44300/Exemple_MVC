package project.path;

import java.awt.*;

/**
 * Interface for all classes implementing an shape path
 */
public interface Path {
    /**
     * Get the point that are on this src.path
     * @return The next point followed by this Path
     */
    Point getNextPoint();

    /**
     * Set the drawing speed of this shape
     * @param speed the new speed it should always be a positive number
     */
    void setSpeed(int speed);

    /**
     * Get the speed of this shape
     * @return a positive number
     */
    int getSpeed();

    /**
     * Are we done drawing the this shape
     * @return A bool true if we are done drawing this shape
     */
    boolean isDone();
}
