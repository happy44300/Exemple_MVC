package project.controller;

import project.Model;
import project.path.Path;
import project.shape.Shapes;

/**
 * Controller for managing button input
 */
public class ButtonController {

    /**
     * The controller linked to this model
     */
    Model model;

    /**
     * Create a new controller managing button input for the model
     * @param model the model to link this controller to
     */
    public ButtonController(Model model) {
        this.model = model;
    }

    /**
     * Notify this controller of an update on model.path
     * @param path the new path value
     */
    public void notifyPathUpdate(Path path){
        this.model.setPath(path);
    }

    /**
     * Notify this controller of an update on model.shape
     * @param shape the new shape value
     */
    public void notifyShapeUpdate(Shapes shape){
        this.model.setShape(shape);
    }
}
