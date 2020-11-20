
package src.shape;

import src.View;

import java.awt.*;

public class Square implements Shapes {

	Point topLeftCorner;
	int size;
	View view;

	public Square(Point topLeftCorner, int size, View view) {
		this.topLeftCorner = topLeftCorner;
		this.size = size;
		this.view = view;
	}

	/**
	 * Draw this src.shape
	 */
	@Override
	public void draw(Graphics graphics) {
		graphics.drawRect(this.topLeftCorner.x, this.topLeftCorner.y, size,size);

	}

	/**
	 * Move this src.shape to the desired position
	 *
	 * @param position The new point to move to
	 */
	@Override
	public void moveTo(Point position) {
		this.topLeftCorner = position;
		view.update();
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
