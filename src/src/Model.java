package src;

import src.path.LemniscateOfBernoulli;
import src.path.Path;
import src.shape.Shapes;
import src.shape.Square;

import javax.swing.*;
import java.awt.*;

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
