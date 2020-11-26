package project;

import project.path.CirclePath;
import project.path.Path;
import project.shape.Shapes;
import project.shape.Square;

import java.awt.*;
import java.util.Observable;

/**
 * The project model
 */
public class Model {

	/**
	 * The currently drawn shape
	 */
	private Shapes shape;

	/**
	 * The currently selected shape
	 */
	private Path path;

	public Shapes getShape() {
		return shape;
	}

	public void setShape(Shapes shape) {
		this.shape = shape;
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	/**
	 * Constructor for model
	 */
	public Model() {
		this.shape = null;
		this.path = new CirclePath();
	}

}
