package project.shape;

import project.View;

import java.awt.*;

/**
 * Class representing a circle
 */
public class Circle implements project.shape.Shapes {

	/**
	 * The center of this circle
	 */
	private Point _center;
	/**
	 * The radius of this circle, in pixel
	 */
	private final Double _radius;

	/**
	 * The view linked to this square
	 */
	private final View _view;
	
	/**
	 * The color of this shape
	 */
	private Color color;


	/**
	 * Class constructor
	 * @param center The center of the circle
	 * @param radius The radius of the circle
	 * @param view The view this Circle will update when moved
	 */
	public Circle(Point center, Double radius,View view) {
		this._center = center;
		this._radius = radius;
		this._view = view;
		this.color = Color.BLACK;
	}

	/**
	 * Draw this src.shape
	 */
	@Override
	public void draw(Graphics graphics) {
		int diameter = (int)(_radius * 2);
		int x = (int)(_center.x - _radius),
			y = (int)(_center.y - _radius);
		graphics.setColor(color);
		graphics.fillOval(x + this._radius.intValue(), y , diameter, diameter);
	}

	/**
	 * Move this src.shape top left corner to the desired position
	 *
	 * @param position The new point to move to
	 */
	@Override
	public void moveTo(Point position) {
		this._center = position;
		_view.update();
	}


	/**
	 * Rotate this src.shape by the desired angle
	 *
	 * @param angle the angle to rotate in degrees between 0 and 360
	 */
	@Override
	public void rotate(int angle) {}

	/**
	 * Gets the color of a src.shape
	 *
	 * @return This src.shape color
	 */
	@Override
	public Color getColor() {
		return this.color;
	}

	/**
	 * Change the color of a src.shape
	 *
	 * @param color The new color of the src.shape
	 */
	@Override
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Get the rotation of a shape
	 * @return this shape rotation
	 */
	@Override
	public int getRotation() {
		return 0;
	}

	/**
	 * Return true the point is in this shape
	 *
	 * @param point The point to test
	 * @return a boolean representing if the point is in this shape
	 */
	@Override
	public boolean contain(Point point) {
		double dx = point.x - _center.x;
		double dy = point.y - _center.y;
		return dx*dx + dy*dy - _radius*_radius <= 0;
	}
}