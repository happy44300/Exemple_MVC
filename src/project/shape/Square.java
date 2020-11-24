
package project.shape;

import project.View;

import java.awt.*;

/**
 * Class representing a square
 */
public class Square implements Shapes {

	/**
	 * the top left corner point of the square
	 */
	private Point _topLeftCorner;
	/**
	 * The length of a square side
	 */
	private int _size;
	/**
	 * The view linked to this square
	 */
	private View _view;
	/**
	 * The rotation of this square
	 */
	private int _rotation;


	/**
	 * Constructor for class Square
	 * @param topLeftCorner the top left corner from witch the square will be drawn
	 * @param size the length of a side
	 * @param rotation the rotation of the square
	 * @param view the view that this square will be linked to
	 */
	public Square(Point topLeftCorner, int size, int rotation, View view) {
		this._topLeftCorner = topLeftCorner;
		this._size = size;
		this._view = view;
		this._rotation = rotation;
	}

	/**
	 * Draw this shape
	 * @param graphics The graphic context drawn on
	 */
	@Override
	public void draw(Graphics graphics) {
		Graphics2D g2d = (Graphics2D)graphics;
		g2d.rotate(Math.toRadians(this._rotation));
		graphics.drawRect(this._topLeftCorner.x, this._topLeftCorner.y, _size, _size);

	}

	/**
	 * Move this shape to the desired position
	 *
	 * @param position The new point to move to
	 */
	@Override
	public void moveTo(Point position) {
		this._topLeftCorner = position;
		_view.update();
	}

	/**
	 * Rotate this shape by the desired angle
	 *
	 * @param angle the angle to rotate in degrees between 0 and 360
	 */
	@Override
	public void rotate(int angle) {
		this._rotation = angle;
	}

	/**
	 * Gets the color of a src.shape
	 *
	 * @return This shape color
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
