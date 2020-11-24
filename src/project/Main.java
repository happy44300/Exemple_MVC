package project;

import javax.swing.*;

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
