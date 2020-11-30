package project.path;

import java.awt.*;

/**
 * Represent the points of a Lemniscate of Bernoulli
 */
public class LemniscateOfBernoulli implements Path {

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
     * Create a new path following the shape of a Lemniscate Of Bernoulli
     * @param startPos the position of the first point
     * @param size the size of the lemniscate
     * @param speed the distance between each point on the shape
     */
    public LemniscateOfBernoulli(Point startPos, int size, int speed) {
        this.startPos = startPos;
        this.size = size;
        this.speed = speed;
        this.isDone = false;
        this.phi = -Math.PI;
    }

    /**
     * Set the drawing speed of the Lemniscate*
     * @param speed  A int representing the speed it should always be a positive number
     */
    @Override
    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        }
        else {
            throw new IllegalArgumentException("speed must be > 0");
        }
    }

    /**
     * Get the drawing speed of the Lemniscate
     * @return A int representing the speed
     */
    @Override
    public int getSpeed() {
        return speed;
    }

    /**
     * Get the next point on the Lemniscate
     * Note: this method still work even if isDone() is true
     * In that case it will simply start looping on itself
     * Use isDone() before calling this function to avoid an overrun
     * @return The next point followed by this Path
     */
    @Override
    public Point getNextPoint() {

        if(this.phi > Math.PI){
            isDone = true;
        }
        int x = (int) (startPos.x + (size * ((Math.sin(phi))/(1+Math.cos(phi)*Math.cos(phi)))));
        int y = (int) (startPos.y + (size * (Math.sin(phi)*Math.cos(phi))/(1+Math.cos(phi)*Math.cos(phi))));
        phi += speed * 0.001;
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
