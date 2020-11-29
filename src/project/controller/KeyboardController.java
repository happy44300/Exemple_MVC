package project.controller;

import project.Model;

import java.awt.event.KeyEvent;

/**
 * Controller for keyboard related event
 */
public class KeyboardController {

    /**
        Link this controller to the model
     */
    private final Model model;

    /**
     * Create a new keyboard controller to listen for key event
     * @param model The model to modify
     */
    public KeyboardController(Model model) {
        this.model = model;
    }

    /**
     * Notify this controller that a keyboard event has occured
     * @param event the KeyEvent thas has occured
     */
    public void notifyClick(KeyEvent event) {
        System.out.println("keyboard clicked");

        if(event.getKeyCode() == KeyEvent.VK_PLUS){
            System.out.println("pressed +");
            model.getPath().setSpeed(model.getPath().getSpeed()+1);
        }
        if(event.getKeyChar() == '-'){
            System.out.println("pressed -");
            model.getPath().setSpeed(model.getPath().getSpeed()-1);
        }
    }


}
