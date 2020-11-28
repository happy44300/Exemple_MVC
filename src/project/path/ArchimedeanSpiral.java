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
    private int speed;
    private double phi;
    private int size;
    private Point startPos;
    private Boolean isDone;

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public ArchimedeanSpiral(Point startPos, int size) {
        this.size = size;
        this.startPos = startPos;
        this.phi=0;
        this.isDone = false;
        this.speed = 10;
    }


    /**
     * Get the point that are on this src.path
     *
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

    @Override
    public boolean isDone() {
        return isDone;
    }
}
