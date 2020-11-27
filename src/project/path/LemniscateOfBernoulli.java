package project.path;

import java.awt.*;

/**
 * Represent the points of a Lemniscate of Bernoulli
 */
public class LemniscateOfBernoulli implements Path {

    /**
     * represent where we are on the path
     */
    private double phi = -Math.PI;
    private  Point startPos;
    private int offset;
    private int size;
    private boolean isDone;

    public LemniscateOfBernoulli(Point startPos, int size) {
        this.startPos = startPos;
        this.size = size;
        this.isDone = false;
    }

    /**
     * Get the point that are on this Path
     * @return The next point followed by this Path
     */
    @Override
    public Point getNextPoint() {
        if(this.phi > Math.PI){
            isDone = true;
        }
        int x = (int) (startPos.x + (size * Math.sqrt(2) * (Math.sin(phi)/1+Math.pow(Math.cos(phi),2))));
        int y = (int) (startPos.y + (size * Math.sqrt(2) * (Math.sin(phi)* Math.cos(phi)/1+Math.pow(Math.cos(phi),2))));
        phi += 0.01;
        return new Point(x,y);
    }

    @Override
    public boolean isDone() {
        return isDone;
    }
}
