package project.path;

import java.awt.*;

/**
 * Class representing a path
 */
public class ArchimedesSpiral implements Path {

    /**
     * The angle phi used in the formula
     */
    private double phi;
    /**
     * Used as an offset and define where the first point will be
     */
    private final Point startPos;
    /**
     * The increment used between each point on the shape
     */
    private int speed;
    /**
     * The size of the path
     */
    private final int size;
    /**
     * Are we done drawing this shape
     */
    private boolean isDone;

    /**
     * Set the drawing speed of the Spiral
     * @param speed  A int representing the speed it should always be a positive number
     */
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Get the drawing speed of the Spiral
     * @return A int representing the speed
     */
    @Override
    public int getSpeed() {
        return speed;
    }

    /**
     * Create an ArchimedesSpiral
     * @param startPos the position the first point will be
     * @param size the size of the spiral
     * @param speed distance between each point
     */
    public ArchimedesSpiral(Point startPos, int size, int speed) {
        this.size = size;
        this.startPos = startPos;
        this.phi=0;
        this.speed = speed;
        this.isDone = false;

    }


    /**
     * Get the next point on the Spiral
     * Note: this method still work even if isDone() is true
     * In that case it will simply keep going and may leave the screen
     * Use isDone() before calling this function to avoid an overrun
     * @return The next point followed by this Path
     */
    @Override
    public Point getNextPoint() {
        int x = (int) (startPos.x + size * (-phi) * Math.cos(phi));
        int y = (int) (startPos.y + size *(-phi)*Math.sin(phi));

        if(this.phi <= 5*Math.PI) {
            this.phi += speed * 0.01;
        }else {
            isDone = true;
        }
        return new Point(x,y);
    }

    /**
     * Are we done drawing the this shape
     * @return A bool true if we are done drawing this shape
     */
    @Override
    public boolean isDone() {
        return isDone;
    }
}
