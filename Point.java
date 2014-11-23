package geometri;

import java.awt.Color;


public class Point extends Form{

	
	/**
	 * Creates a Point from a position and color.
	 * @param x
	 * @param y
	 * @param c
	 * @throws IllegalPositionException
	 */
	public Point(int x, int y, Color c) throws IllegalPositionException{}
	
	/**
	 * Creates a Point with the same position as an already given GeometricalForm, and a color.
	 * @param f
	 * @param c
	 */
	public Point(GeometricalForm f, Color c){}
	
	
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
