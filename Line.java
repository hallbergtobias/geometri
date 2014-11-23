package geometri;

import java.awt.Color;


public class Line extends Form{

	/**
	 * The ending X coordinate
	 */
	private int x2;
	/**
	 * The ending Y coordinate
	 */
	private int y2;
	
	/**
	 * Creates a Line from two coordinates (x1,y1) to (x2,y2), and color.
	 * @param x1 The first X coordinate
	 * @param y1 The first Y coordinate
	 * @param x2 The second X coordinate
	 * @param y2 The second Y coordinate
	 * @param c The Color
	 * @throws IllegalPositionException
	 */
	public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {}
	
	/**
	 * Creates a Line ....
	 * @param f1
	 * @param f2
	 * @param c The Color
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c) {}
	   
	

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
