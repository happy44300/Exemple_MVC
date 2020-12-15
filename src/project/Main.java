package project;

import project.controller.ButtonController;
import project.controller.KeyboardController;
import project.controller.MouseController;
import project.controller.TickController;

import javax.swing.*;
import java.util.Timer;

/**
 * The main class
 */
public class Main {

    /**
     * Project entry point
     * @param args main args
     */
    public static void main(String[] args){
        Model model = new Model();
        TickController tickController = new TickController(model);
        KeyboardController keyboardController = new KeyboardController(model);
        MouseController mouseController = new MouseController(model);
        ButtonController buttonController = new ButtonController(model);

        SwingUtilities.invokeLater(() -> {
            View view = new View("PROJEEEEET", 500, 500, model, buttonController );
            view.setMouseController(mouseController);
            view.setKeyBoardController(keyboardController);
            view.setVisible(true);
            view.setResizable(false);
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(tickController,16,16);
    }
}
