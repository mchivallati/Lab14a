package net.franklinps.chivallati.Lab14a;

// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
   
   public Shape4Circle(Graphics g)
   {
      
      drawShape(g);
      
   }
   
   public void drawShape(Graphics g)
   {
      
      g.fillOval( 500 , 350 , 200 , 200 );
      
   }
   
}