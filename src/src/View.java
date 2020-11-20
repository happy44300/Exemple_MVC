package src;

import src.path.DrawingPanel;
import src.shape.Shapes;
import src.shape.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *  Provide an display to the app
 */
public class View extends JFrame {

	private final DrawingPanel drawingPanel = new DrawingPanel();

	/**
	 * Class constructor
	 * @param title the title of our windows that will be displayed to the user
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
		update();
	}

	/**
	 * build the windows content
	 */
	private void buildContentPane() {
		JPanel panel = new JPanel();
		JPanel LPanel = new JPanel();

		panel.setLayout(new BorderLayout());

		getContentPane().add(panel);
		getContentPane().add(panel);
		panel.add(new JLabel("CENTER␣JPanel"));

		panel.add(drawingPanel, BorderLayout.CENTER);
		panel.add(LPanel, BorderLayout.LINE_END);
		LPanel.setLayout(new BoxLayout(LPanel, BoxLayout.Y_AXIS));

		LPanel.add(new JButton("oui"));

		ButtonGroup shapeButtonGroup = new ButtonGroup();

		//list all the possible src.shape that exist
		JRadioButton[] shapeButtonTab = {new JRadioButton("Lemniscate"), new JRadioButton("spirale")};

		for (JRadioButton button : shapeButtonTab){
			shapeButtonGroup.add(button);
			button.setSelected(false);
			LPanel.add(button);
			button.addActionListener(new ShapeListener());
		}
		shapeButtonTab[0].setSelected(true);

		setShape(new Square(new Point(0,0), 10, this));
	}

	/**
	 * Set the currently drawn src.shape
	 * @param shape the src.shape to be drawn
	 */
	public void setShape(Shapes shape){
		drawingPanel.setShape(shape);
	}

	/**
	 * update the current displayed graphic
	 */
	public void update(){
		drawingPanel.paintComponent(getGraphics());
	}

	private class ShapeListener implements ActionListener{

		/**
		 * Invoked when an action occurs.
		 *
		 * @param e the event to be processed
		 */
		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}
}
