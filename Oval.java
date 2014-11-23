package geometri;

import java.awt.Color;

public class Oval extends Form{
	
	/**
	 * The height
	 */
	private int height;
	/**
	 * The width
	 */
	private int width;
	

	/**
	 * Creates an Oval with a position, height, width and color.
	 * @param x The X coordinate
	 * @param y The Y coordinate
	 * @param width The width
	 * @param height The height
	 * @param c The Color
	 * @throws IllegalPositionException
	 */
	 public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException {}
	 
	 /**
	  * Creates an Oval with the same position as an already given GeometricalForm, a new height, width and color.
	  * @param f A GeometricalForm
	  * @param width The width
	  * @param height The height
	  * @param c The color
	  */
	 public Oval(GeometricalForm f, int width, int height, Color c){}
	 
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
