package project;

import project.controller.KeyboardController;
import project.controller.MouseController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * This class represent the panel on witch the shape are drawn
 */
public class DrawingPanel extends JPanel implements KeyListener, MouseListener {

    /**
     * the model linked to this drawing panel
     */
    private final Model model;

    private  KeyboardController keyboardController;
    private MouseController mouseController;

    public void setKeyboardController(KeyboardController keyboardController) {
        this.keyboardController = keyboardController;
    }

    public void setMouseController(MouseController mouseController) {
        this.mouseController = mouseController;
    }

    /**
     * Creates a new DrawingPanel
     * @param model The model this DrawingPanel will be linked to
     */
    public DrawingPanel(Model model) {
        this.model = model;
    }

    /**
     * Draw the shape assigned to this component
     * @param graphics The graphic context drawn on
     */
    public void paintComponent(Graphics graphics) {
            if (model.getShape() != null)
                model.getShape().draw(graphics);
    }

    public void clearDrawing(Graphics graphics){
        super.paintComponent(graphics);
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
        keyboardController.notifyClick(e);
    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent e) {
        keyboardController.notifyClick(e);
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

    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        mouseController.notifyMouseClick(e);
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
