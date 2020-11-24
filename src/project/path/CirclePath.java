package project.path;

import java.awt.*;

public class CirclePath implements Path {

    int pos = 0;

    /**
     * Get the point that are on this src.path
     *
     * @return The next point followed by this Path
     */
    @Override
    public Point getNextPoint() {
        pos++;
         return new Point(((int) (Math.cos(pos)*20)+200),(int) (Math.sin(pos)*20)+200);
    }
}
