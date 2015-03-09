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

      g.fillPolygon( regOctagon( 150 , 375 , 50 ) );
      
   }
   
   private Polygon regOctagon( int centerX , int centerY , int spokeLength )
   {

      double theta = 45;
      Point center = new Point( centerX , centerY );

      int[] octoXPoints = new int[ 8 ];
      int[] octoYPoints = new int[ 8 ];

      octoXPoints[ 0 ] = (int) center.getX() + spokeLength;
      octoYPoints[ 0 ] = (int) center.getY();

      for ( int i = 1 ; i < 7 ; i++ )
      {

         octoYPoints[ i ] = ( spokeLength * (int) Math.sin( Math.toRadians( theta ) ) + (int) center.getY() );
         System.out.println( "Value of the y component when theta is " + theta + " at index" + i + ": " + octoYPoints[i] );


         octoXPoints[ i ] = ( spokeLength * (int) Math.cos( Math.toRadians( theta ) ) + (int) center.getX() );
         System.out.println( "Value of the x component when theta is " + theta + " at index" + i + ": " + octoXPoints[i] );


         theta += 45;

      }

      System.out.println("Length of octoXPoints :" + octoXPoints.length);
      System.out.println("Length of octoYPoints :" + octoYPoints.length);

      return new Polygon( octoXPoints, octoYPoints , 8 );
      
   }

}