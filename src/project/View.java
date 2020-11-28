package project;

import project.controller.KeyboardController;
import project.controller.MouseController;
import project.path.CirclePath;
import project.path.LemniscateOfBernoulli;
import project.shape.Circle;
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
	 * The model associated to this view
	 */
	private final Model model;

	/**
	 * The drawing panel associated to this view
	 */
	private final DrawingPanel drawingPanel;



	/**
	 * Class constructor
	 * @param title the title of our windows that will be displayed to the user
	 * @param width windows width
	 * @param height windows height
	 * @param model the model to be associated to this view
	 */
	public View(String title,int width,int height, Model model) {
		super(title);
		this.model = model;
		this.drawingPanel = new DrawingPanel(model);
		addKeyListener(drawingPanel);
		addMouseListener(drawingPanel);
		build(width, height);
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

		/*
		//add Speed slider
		GUIPanel.add(new JLabel("Movement Speed"));
		GUIPanel.add(new JSlider(JSlider.HORIZONTAL,0,100,0));

		//add rotation speed slider
		GUIPanel.add(new JLabel("Rotation Speed"));
		GUIPanel.add(new JSlider(JSlider.HORIZONTAL,0,100,0));
		 */

		//list all the possible Path that exist
		GUIPanel.add(new JLabel("Select a Path"));
		JRadioButton[] pathButtons = {new JRadioButton("Lemniscate"), new JRadioButton("Spiral")};
		ButtonGroup pathButtonsGroup = new ButtonGroup();

		for (JRadioButton button : pathButtons){
			pathButtonsGroup.add(button);
			button.setSelected(false);
			GUIPanel.add(button);
			button.addActionListener(new PathListener(this, pathButtonsGroup, model));
		}

		//list all the possible Shapes that exists, this help make our code more easily extensible
		GUIPanel.add(new JLabel("Select a path"));
		JRadioButton[] shapeButtons = {new JRadioButton("Square"), new JRadioButton("Circle")};
		ButtonGroup shapeButtonGroup = new ButtonGroup();

		for (JRadioButton button : shapeButtons){
			shapeButtonGroup.add(button);
			button.setSelected(false);
			GUIPanel.add(button);
			button.addActionListener(new ShapeListener(this, shapeButtonGroup, model));
		}

	}

	/**
	 * Redraw the current display
	 */
	public void update(){
		drawingPanel.paintComponent(getGraphics());
	}

	public void setKeyBoardController(KeyboardController keyBoardController){
		drawingPanel.setKeyboardController(keyBoardController);
	}
	public void setMouseController(MouseController mouseController){
		drawingPanel.setMouseController(mouseController);
	}

	/**
	 * Event listener class for button selecting a Shape, act as a controller
	 */
	private class ShapeListener implements ActionListener{

		/**
		 * The view associated with this Listener
		 */
		private final View view;

		/**
		 * The group of the button we are listening to
		 */
		private final ButtonGroup group;

		/**
		 * The model to modify
		 */
		private final Model model;

		/**
		 * Create a Listener for the radio button selecting the shape
		 * @param view the view the new button with listen to
		 * @param group the button group the listened button belong to
		 * @param model the model to modify
		 */
		public ShapeListener(View view, ButtonGroup group, Model model) {
			this.view = view;
			this.group = group;
			this.model = model;
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

			drawingPanel.clearDrawing(this.view.getGraphics());

			switch (selectedButtonText) {
				case "Square" -> this.model.setShape(new Square(new Point(100, 100), 10, 10, view));
				case "Circle" -> this.model.setShape(new Circle(new Point(200, 200), (double) 10, view));
			}
		}
	}

	/**
	 * Event listener class for button selecting a Path, act as controller
	 */
	private class PathListener implements ActionListener{

		/**
		 * The view associated with this Listener
		 */
		private final View view;

		/**
		 * The group of the button we are listening to
		 */
		private final ButtonGroup group;

		/**
		 * The model to modify
		 */
		private final Model model;

		/**
		 * Create a Listener for the radio button selecting the path
		 * @param view the view the new button with listen to
		 * @param group the button group the listened button belong to
		 * @param model the model to modify
		 */
		public PathListener(View view, ButtonGroup group, Model model) {
			this.view = view;
			this.group = group;
			this.model = model;
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

			drawingPanel.clearDrawing(this.view.getGraphics());

			switch (selectedButtonText) {
				case "Lemniscate" -> this.model.setPath(new LemniscateOfBernoulli(new Point(200,200),40));
				case "Spiral" -> this.model.setPath(new CirclePath());
			}
		}
	}


}
