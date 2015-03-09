package net.franklinps.chivallati.Lab14a;// Lab14avst.java
// Lab14a
// Student starting version


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14avst extends Applet
{
	public void paint(Graphics g)
	{
		
		drawGrid(g);
		
		Shape1Square square = new Shape1Square(g);
		Shape2Triangle tri = new Shape2Triangle(g);
		Shape3Octagon octo = new Shape3Octagon(g);
		Shape4Circle circle = new Shape4Circle(g);
		
	}

	public void drawGrid(Graphics g)
	{
		
      g.drawRect(10,10,800,600);
		g.drawLine(10,300,810,300);
		g.drawLine(410,10,410,610);
		
	}
}

