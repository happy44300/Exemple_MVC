package project;

import project.path.CirclePath;
import project.path.LemniscateOfBernoulli;
import project.path.Path;
import project.shape.Shapes;

import java.awt.*;

/**
 * The project model
 */
public class Model {

	/**
	 * The shape in this model
	 */
	private Shapes shape;

	/**
	 * The path in this model
	 */
	private Path path;

	/**
	 * Get the shape on this model
	 * @return The shape on this model
	 */
	public Shapes getShape() {
		return shape;
	}

	/**
	 * Set the shape on this model
	 * @param shape the new shape
	 */
	public void setShape(Shapes shape) {
		this.shape = shape;
	}

	/**
	 * Get the path on this selected
	 * @return The path on this model
	 */
	public Path getPath() {
		return path;
	}

	/**
	 * Set the path on this model
	 * @param path The new path
	 */
	public void setPath(Path path) {
		this.path = path;
	}

	/**
	 * Constructor for model
	 */
	public Model() {
		this.shape = null;
		this.path = new LemniscateOfBernoulli(new Point(200,200),20);
		//this.path = new CirclePath();
	}

}
