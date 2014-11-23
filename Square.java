package geometri;

import java.awt.Color;


public class Square extends Form{
	
	/**
	 * One side of the square
	 */
	private int side;

	/**
	 * Creates a Square from a position, size and color.
	 * @param x
	 * @param y
	 * @param side
	 * @param c
	 * @throws IllegalPositionException
	 */
	public Square(int x, int y, int side, Color c) throws IllegalPositionException {}
	
	/**
	 * Creates a Square with the same position as an already given GeometricalForm, a new size, and a color.
	 * @param f
	 * @param side
	 * @param c
	 */
	public Square(GeometricalForm f, int side, Color c) {}
	
	
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
