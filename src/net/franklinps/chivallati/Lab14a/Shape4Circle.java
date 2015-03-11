package net.franklinps.chivallati.Lab14a;

// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
   
   public Shape4Circle(Graphics g)
   {

      /*drawShape(g);
      displayNumSides(g);
      displayName(g);*/
      
   }
   
   public void drawShape(Graphics g)
   {
      
      g.fillOval( 500 , 350 , 200 , 200 );
      
   }

   public void displayNumSides(Graphics g)
   {

      g.drawString( "A Circle has 0 sides" , 420 , 580 );

   }

   public void displayName(Graphics g)
   {

      g.drawString( "Circle" , 420 , 320 );

   }


}