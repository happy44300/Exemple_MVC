import javax.swing.*;
import java.awt.*;
import javax.swing.*;

/**
 *  Provide an display to the app
 */
public class View extends JFrame {

	/**
	 * Class constructor
	 * @param title the title of our windows that shall be displayed to the user
	 * @param w windows width
	 * @param h windows height
	 */
	public View(String title,int w,int h) {
		super(title);
		build(w, h);
	}

	/**
	 * Build a new windows to display
	 * @param w windows width
	 * @param h windows height
	 */
	private void build(int w,int h) {
		setPreferredSize(new Dimension(w, h));
		buildContentPane();
		setLocationRelativeTo(null);
		setResizable(true);
		pack();
	}

	/**
	 * build a new content panel
	 * TODO: implement interface
	 */
	private void buildContentPane() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		getContentPane().add(panel);
		panel.add(new JLabel("CENTER␣JPanel"));
		JPanel cPanel =new JPanel();
		cPanel.add(new JLabel("CENTER␣JPanel"));
		panel.add(cPanel, BorderLayout.CENTER);
	}
}
