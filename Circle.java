package geometri;

import java.awt.Color;

public class Circle extends Form{

	/**
	 * The diameter of the circle
	 */
	private int diameter;
	
	
	/**
	 * Creates a Circle from a position, diameter and color.
	 * @param x X coordinate from top left corner
	 * @param y Y coordinate from top left corner
	 * @param diameter The diameter
	 * @param c The color
	 * @throws IllegalPositionException
	 */
	public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {}
	
	/**
	 * Creates a Circle with the same position as an already given GeometricalForm, a new diameter and color.
	 * @param f A circle
	 * @param diameter The diameter
	 * @param c The color
	 */
	public Circle(GeometricalForm f, int diameter, Color c) {}
	
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
