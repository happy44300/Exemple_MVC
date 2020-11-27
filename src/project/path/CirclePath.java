package project.path;

import java.awt.*;

/**
 * Define a circular path
 */
public class CirclePath implements Path {

    /**
     * represent where we are on the path
     */
    private int pos = 0;

    /**
     * Const defining how fast we go on the path
     */
    private final int speed = 20;

    /**
     * Define a offset to prevent drawing out of bound
     */
    private final int offset = 200;

    private boolean isDone = false;

    /**
     * Get the point that are on this src.path
     *
     * @return The next point followed by this Path
     */
    @Override
    public Point getNextPoint() {
        if(pos > 360) isDone = true;
        pos++;
        return new Point(((int) (Math.cos(pos)*speed)+offset),(int) (Math.sin(pos)*speed)+offset);
    }

    @Override
    public boolean isDone() {
        return isDone;
    }
}
