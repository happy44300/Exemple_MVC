package project;

import project.path.Path;
import project.shape.Shapes;

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
	public Model(Shapes shape, Path path) {
		this.shape = shape;
		this.path = path;
	}

	public Model(){ }
}
