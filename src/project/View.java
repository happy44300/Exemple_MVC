package project;

import project.path.LemniscateOfBernoulli;
import project.shape.Circle;
import project.shape.Shapes;
import project.shape.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

/**
 *  Provide an display to the app
 */
public class View extends JFrame {

	/**
	 * The drawing panel associated to this view
	 */
	private final DrawingPanel drawingPanel = new DrawingPanel();

	/**
	 * The model associated to this view
	 */
	private final Model model = new Model(new Square(new Point(100,100),20,0,this), new LemniscateOfBernoulli());

	/**
	 * Class constructor
	 * @param title the title of our windows that will be displayed to the user
	 * @param width windows width
	 * @param height windows height
	 */
	public View(String title,int width,int height) {
		super(title);
		build(width, height);
	}

	/**
	 * Allow a class to access the model
	 * @return This model
	 */
	public Model getModel() {
		return model;
	}

	/**
	 * Build a new windows to display
	 * @param width windows width
	 * @param height windows height
	 */
	private void build(int width,int height) {
		setPreferredSize(new Dimension(width, height));
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

		//list all the possible Path that exist
		GUIPanel.add(new JLabel("Select a Path"));
		JRadioButton[] pathButtons = {new JRadioButton("Lemniscate"), new JRadioButton("Spiral")};
		ButtonGroup pathButtonsGroup = new ButtonGroup();

		for (JRadioButton button : pathButtons){
			pathButtonsGroup.add(button);
			button.setSelected(false);
			GUIPanel.add(button);
			button.addActionListener(new PathListener(this, pathButtonsGroup));
		}
		pathButtons[0].setSelected(true);

		//list all the possible Shapes that exists, this help make our code more easily extensible
		GUIPanel.add(new JLabel("Select a path"));
		JRadioButton[] shapeButtons = {new JRadioButton("Square"), new JRadioButton("Circle")};
		ButtonGroup shapeButtonGroup = new ButtonGroup();

		for (JRadioButton button : shapeButtons){
			shapeButtonGroup.add(button);
			button.setSelected(false);
			GUIPanel.add(button);
			button.addActionListener(new ShapeListener(this, shapeButtonGroup));
		}
		shapeButtons[0].setSelected(true);
	}

	/**
	 * Set the currently drawn src.shape
	 * @param shape the Shape to be drawn
	 */
	public void addShape(Shapes shape){
		drawingPanel.addShape(shape);
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

		View view;
		ButtonGroup group;

		public ShapeListener(View view, ButtonGroup group) {
			this.view = view;
			this.group = group;
		}

		/**
		 * Invoked when an action occurs.
		 *
		 * @param event the event to be processed
		 */
		@Override
		public void actionPerformed(ActionEvent event) {

			String selectedButtonText = "";

			for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
				AbstractButton button = buttons.nextElement();

				if (button.isSelected()) {
					selectedButtonText = button.getText();
				}
			}
			System.out.println(selectedButtonText);
			switch (selectedButtonText){
				case "Square":
					model.setShape(new Square(new Point(100,100),10,10,view));
					break;
				case "Circle":
					model.setShape(new Circle(new Point(100,100),(double) 10, view));
					break;
				default:
					break;
			}
		}
	}

	/**
	 * Event listener class for button selecting a Path
	 */
	private class PathListener implements ActionListener{

		View view;
		ButtonGroup group;

		public PathListener(View view, ButtonGroup group) {
			this.view = view;
			this.group = group;
		}

		/**
		 * Invoked when an action occurs.
		 *
		 * @param event the event to be processed
		 */
		@Override
		public void actionPerformed(ActionEvent event) {

			String selectedButtonText = "";

			for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
				AbstractButton button = buttons.nextElement();

				if (button.isSelected()) {
					selectedButtonText = button.getText();
				}
			}
			System.out.println(selectedButtonText);
			switch (selectedButtonText){
				case "Lemniscate":
					model.setShape(new Square(new Point(100,100),10,10,view));
					break;
				case "Spiral":
					model.setShape(new Circle(new Point(100,100),(double) 10, view));
					break;
				default:
					break;
			}
		}
	}
}
