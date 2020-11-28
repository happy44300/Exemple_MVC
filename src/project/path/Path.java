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

    void setSpeed(int speed);

    int getSpeed();

    boolean isDone();
}
