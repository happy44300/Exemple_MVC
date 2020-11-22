package src;

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
	/**
	 * The drawing panel to be use
	 */
	private final _DrawingPanel drawingPanel = new _DrawingPanel();

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

		//create main panel
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new BorderLayout());

		//add the panel used for render
		panel.add(drawingPanel, BorderLayout.CENTER);

		//create the panel used as a container for GUI interface
		JPanel GUIPanel = new JPanel();
		panel.add(GUIPanel, BorderLayout.LINE_END);
		GUIPanel.setLayout(new BoxLayout(GUIPanel, BoxLayout.Y_AXIS));

		//add Speed slider
		GUIPanel.add(new JLabel("Movement Speed"));
		GUIPanel.add(new JSlider(JSlider.HORIZONTAL,0,100,0));

		//add rotation speed slider
		GUIPanel.add(new JLabel("Rotation Speed"));
		GUIPanel.add(new JSlider(JSlider.HORIZONTAL,0,100,0));

		//list all the possible src.shape that exist
		GUIPanel.add(new JLabel("Select a shape"));
		JRadioButton[] pathButtons = {new JRadioButton("Lemniscate"), new JRadioButton("spirale")};
		ButtonGroup pathButtonsGroup = new ButtonGroup();

		for (JRadioButton button : pathButtons){
			pathButtonsGroup.add(button);
			button.setSelected(false);
			GUIPanel.add(button);
			button.addActionListener(new ShapeListener());
		}
		pathButtons[0].setSelected(true);

		//list all the possible Path that exist
		GUIPanel.add(new JLabel("Select a path"));
		JRadioButton[] shapeButtons = {new JRadioButton("Square"), new JRadioButton("Circle")};
		ButtonGroup shapeButtonGroup = new ButtonGroup();

		for (JRadioButton button : shapeButtons){
			shapeButtonGroup.add(button);
			button.setSelected(false);
			GUIPanel.add(button);
			button.addActionListener(new PathListener());
		}
		shapeButtons[0].setSelected(true);

		//TODO: remove this debug statement once the game loop is added
		setShape(new Square(new Point(20,20), 10, 45, this));
	}

	/**
	 * Set the currently drawn src.shape
	 * @param shape the Shape to be drawn
	 */
	public void setShape(Shapes shape){
		drawingPanel.setShape(shape);
	}

	/**
	 * Redraw the current display
	 */
	public void update(){
		drawingPanel.paintComponent(getGraphics());
	}

	/**
	 * Event listener class for button selecting a Shape
	 */
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

	/**
	 * Event listener class for button selecting a Path
	 */
	private class PathListener implements ActionListener{

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
