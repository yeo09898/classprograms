package edu.stevens.ee552;

import java.awt.Graphics;

public abstract class Shape {
	protected int x,y;
	
	public Shape(int x, int y) { this.x = x; this.y = y; }
	public abstract void draw(Graphics g) ;	
}
