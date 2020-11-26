package project.controller;

import project.Model;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * project.controller.Controller class for mouse input
 */
public class KeyboardController extends JPanel implements KeyListener {

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

    /**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key typed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("event0");
    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param event the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent event) {
        System.out.println("event1");
        if(event.getKeyCode() == KeyEvent.VK_PLUS){
            System.out.println("pressed +");
        }
        if(event.getKeyChar() == '-'){
            System.out.println("pressed -");
        }
    }

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("event2");
    }
}
