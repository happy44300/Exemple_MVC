package src;

import javax.swing.*;

/**
 * The main class for this project
 */
public class Application {

	/**
	 * Project entry point
	 * @param args Console line args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			View view = new View("PROJEEEEET", 300, 100);
			view.setVisible(true);
		});
	}
}
