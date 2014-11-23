package geometri;

import java.awt.Color;


public class Rectangle extends Form{
	
	/**
	 * The width of the rectangle
	 */
	private int width;
	/**
	 * The height of the rectangle
	 */
	private int height;

	/**
	 * Creates a Rectangle from a position, width, height and color.
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param c
	 * @throws IllegalPositionException
	 */
	public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException {}
	
	/**
	 * Creates a Rectangle with the same position as an already given GeometricalForm, a new width and height, and a color.
	 * @param f
	 * @param width
	 * @param height
	 * @param c
	 */
	public Rectangle(GeometricalForm f, int width, int height, Color c) {}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getArea(){}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getHeight(){}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getPerimeter(){}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getWidth(){}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public int compareTo(){}
	
	
	
	   
	   
}
