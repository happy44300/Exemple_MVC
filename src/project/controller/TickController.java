package project.controller;

import project.Model;
import project.path.Path;
import project.shape.Shapes;

import java.util.TimerTask;

/**
 * Define a controller used to update the model each tick
 */
public class TickController extends TimerTask {
    /**
     The model this controller will modify
     */
    private final Model model;

    /**
     * Create a new keyboard controller to listen for specific key event
     * @param model The model to modify
     */
    public TickController(Model model) {
        this.model = model;
    }


    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        Path path = model.getPath();
        Shapes shape = model.getShape();

        if(path == null || shape == null || path.isDone()){return;}
        shape.moveTo(path.getNextPoint());
        shape.rotate(shape.getRotation() + 1);
    }
}
