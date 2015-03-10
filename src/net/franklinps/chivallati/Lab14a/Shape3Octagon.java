package net.franklinps.chivallati.Lab14a;

// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape
{
   
   public Shape3Octagon(Graphics g)
   {
      
      drawShape(g);
      displayNumSides(g);
      displayName(g);
      
   }

   public void drawShape(Graphics g)
   {

      g.fillPolygon( regOctagon( 175 , 450 , 100 ) );
      
   }

   public void displayNumSides(Graphics g)
   {

      g.drawString( "A Octagon has 8 sides" , 20 , 580 );

   }

   public void displayName(Graphics g)
   {

      g.drawString( "Octagon" , 20 , 320 );

   }
   
   private Polygon regOctagon( int centerX , int centerY , int spokeLength )
   {

      double theta = 45 / 2;
      Point center = new Point( centerX , centerY );

      int[] octoXPoints = new int[ 8 ];
      int[] octoYPoints = new int[ 8 ];

      for ( int i = 0 ; i < 8 ; i++ )
      {

         octoYPoints[ i ] = (int) ( spokeLength * Math.sin( Math.toRadians( theta ) ) + center.getY() );

         octoXPoints[ i ] = (int) ( spokeLength * Math.cos( Math.toRadians( theta ) ) + center.getX() );

         theta += 45;

      }

      return new Polygon( octoXPoints, octoYPoints , 8 );
      
   }

}
