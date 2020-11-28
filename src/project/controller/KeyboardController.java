package project.controller;

import project.Model;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * project.controller.Controller class for mouse input
 */
public class KeyboardController {

    /**
        Link this view to the model
     */
    private final Model model;

    /**
     * Create a new keyboard controller to listen for specific key event
     * @param model The model to modify
     */
    public KeyboardController(Model model) {
        this.model = model;
    }

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
