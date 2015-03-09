package net.franklinps.chivallati.Lab14a;

// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
   
   public Shape1Square(Graphics g)
   {
      
      g.drawString( "Square" , 20 , 30 );
      g.drawString( "A Square has 4 sides" , 20 , 280 );
      drawShape(g);
      
   }
   
   public void drawShape(Graphics g)
   {
      
      g.fillRect( 105, 55, 200, 200 );
      
   }
   
   
   
}

