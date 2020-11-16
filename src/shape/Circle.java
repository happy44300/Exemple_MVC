package shape;

import java.awt.*;

public class Circle implements Shape {

	Point center;
	Double radius;

	public Circle(Point center, Double radius) {
		this.center = center;
		this.radius = radius;
	}

	/**
	 * Move this shape to the desired position
	 *
	 * @param position The new point to move to
	 */
	@Override
	public void moveTo(Point position) {

	}

	/**
	 * Rotate this shape by the desired angle
	 *
	 * @param angle the angle to rotate in degrees between 0 and 360
	 */
	@Override
	public void rotate(int angle) {

	}

	/**
	 * Gets the color of a shape
	 *
	 * @return This shape color
	 */
	@Override
	public Color getColor() {
		return null;
	}

	/**
	 * Change the color of a shape
	 *
	 * @param color The new color of the shape
	 */
	@Override
	public void setColor(Color color) {

	}
}
