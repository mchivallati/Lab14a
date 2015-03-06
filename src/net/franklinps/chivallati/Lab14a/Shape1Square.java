package net.franklinps.chivallati.Lab14a;

// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
   
   public Shape1Square(Graphics g)
   {
      
      drawShape(g);
      
   }
   
   public void drawShape(Graphics g)
   {
      
      g.fillRect( 105, 55, 200, 200 );
      
   }
   
   
   
}

