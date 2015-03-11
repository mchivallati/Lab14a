package net.franklinps.chivallati.Lab14a;

// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
   
   public Shape2Triangle(Graphics g)
   {

      /*drawShape(g);
      displayNumSides(g);
      displayName(g);*/
      
   }
   
   public void drawShape(Graphics g)
   {
      
      g.fillPolygon( tri( 600 , 55 , 700 , 205 , 500 , 205 ) );
      
   }

   public void displayNumSides(Graphics g)
   {

      g.drawString( "A Triangle has 3 sides" , 420 , 280 );

   }

   public void displayName(Graphics g)
   {

      g.drawString( "Triangle" , 420 , 30 );

   }

   public Polygon tri( int x1, int y1, int x2, int y2, int x3, int y3 )
   {

      int x[] = { x1 , x2 , x3 };

      int y[] = { y1 , y2 , y3 };

      return new Polygon( x, y, 3 );

   }
   
}

