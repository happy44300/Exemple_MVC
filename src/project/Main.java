package project;

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

        SwingUtilities.invokeLater(() -> {
            View view = new View("PROJEEEEET", 500, 500, model);
            view.setMouseController(new MouseController(model));
            view.setKeyBoardController(new KeyboardController(model));
            view.setVisible(true);

        });
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(tickController,16,16);
    }
}
