package project.path;

import java.awt.*;

/**
 * Class representing a path
 */
public class ArchimedeanSpiral implements Path {

    /**
     * represent where we are on the path
     */
    private int pos = 0;
    private int speed = 10;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }


    /**
     * Get the point that are on this src.path
     *
     * @return The next point followed by this Path
     */
    @Override
    public Point getNextPoint() {
        return null;
    }

    @Override
    public boolean isDone() {
        return false;
    }
}
