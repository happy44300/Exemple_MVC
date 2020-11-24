package src.shape;

import src.View;

import java.awt.*;

/**
 * Class representing a circle
 */
public class Circle implements src.shape.Shapes {

	/**
	 * The center of this circle
	 */
	private Point _center;
	/**
	 * The radius of this circle, in pixel
	 */
	private Double _radius;

	/**
	 * The view linked to this square
	 */
	private View _view;

	/**
	 * Class constructor
	 * @param center The center of the circle
	 * @param radius The radius of the circle
	 */
	public Circle(Point center, Double radius,View view) {
		this._center = center;
		this._radius = radius;
		this._view = view;
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
		this._center = position;
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
