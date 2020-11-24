package src;

import src.path.LemniscateOfBernoulli;
import src.shape.Square;

import javax.swing.*;
import java.awt.*;

public class Main {

    /**
     * Project entry point
     * @param args
     */
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            View view = new View("PROJEEEEET", 300, 300);
            view.setVisible(true);
        });
    }
}
