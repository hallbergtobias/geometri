package geometri;

import java.awt.Color;
import java.awt.Graphics;


public class Form implements GeometricalForm{
	
	/**
	 * X position from top left corner
	 */
	int x;
	/**
	 * Y position from top left corner
	 */
	int y;
	/**
	 * Color of the shape
	 */
	Color c;
	
	/**
	 * {@inheritDoc}
	 */
	public void fill(Graphics g){}
	/**
	 * {@inheritDoc}
	 */
    public Color getColor(){}
    /**
	 * {@inheritDoc}
	 */
    public int getArea(){}
    /**
	 * {@inheritDoc}
	 */
    public int compareTo(GeometricalForm f){}
    /**
	 * {@inheritDoc}
	 */
    public int getHeight(){}
    /**
	 * {@inheritDoc}
	 */
    public int getPerimeter(){}
    /**
	 * {@inheritDoc}
	 */
    public int getWidth(){}
    /**
	 * {@inheritDoc}
	 */
    public int getX(){}
    /**
	 * {@inheritDoc}
	 */
    public int getY(){}
    /**
	 * {@inheritDoc}
	 */
    public void move(int dx, int dy) throws IllegalPositionException{}
    /**
	 * {@inheritDoc}
	 */
    public void place(int x, int y) throws IllegalPositionException{}

}
