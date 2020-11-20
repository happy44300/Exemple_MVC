package src.shape;

import java.awt.*;

public class Circle implements src.shape.Shapes {

	Point center;
	Double radius;

	public Circle(Point center, Double radius) {
		this.center = center;
		this.radius = radius;
	}

	/**
	 * Draw this src.shape
	 */
	@Override
	public void draw(Graphics graphics) {

	}

	/**
	 * Move this src.shape top left corner to the desired position
	 *
	 * @param position The new point to move to
	 */
	@Override
	public void moveTo(Point position) {
		this.center = position;
	}

	/**
	 * Rotate this src.shape by the desired angle
	 *
	 * @param angle the angle to rotate in degrees between 0 and 360
	 */
	@Override
	public void rotate(int angle) {

	}

	/**
	 * Gets the color of a src.shape
	 *
	 * @return This src.shape color
	 */
	@Override
	public Color getColor() {
		return null;
	}

	/**
	 * Change the color of a src.shape
	 *
	 * @param color The new color of the src.shape
	 */
	@Override
	public void setColor(Color color) {

	}
}
