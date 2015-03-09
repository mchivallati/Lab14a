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
      
   }

   public void drawShape( Graphics g )
   {
      
      g.drawString( "Octagon" , 20 , 320 );
      g.drawString( "A Octagon has 8 sides" , 20 , 580 );
      g.fillPolygon( regOctagon( 175 , 450 , 100 ) );
      
   }
   
   private Polygon regOctagon( int centerX , int centerY , int spokeLength )
   {

      double theta = 45;
      Point center = new Point( centerX , centerY );

      int[] octoXPoints = new int[ 8 ];
      int[] octoYPoints = new int[ 8 ];

      octoXPoints[ 0 ] = (int) center.getX() + spokeLength;
      octoYPoints[ 0 ] = (int) center.getY();

      for ( int i = 1 ; i < 8 ; i++ )
      {

         octoYPoints[ i ] = (int) ( spokeLength * Math.sin( Math.toRadians( theta ) ) + center.getY() );

         octoXPoints[ i ] = (int) ( spokeLength * Math.cos( Math.toRadians( theta ) ) + center.getX() );

         theta += 45;

      }

      return new Polygon( octoXPoints, octoYPoints , 8 );
      
   }

}
