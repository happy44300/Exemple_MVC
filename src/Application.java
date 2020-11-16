import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			View view = new View("PROJEEEEET", 300, 100);
			view.setVisible(true);
		});
	}
}
