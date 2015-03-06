package net.franklinps.chivallati.Lab14a;

// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape {

   public void drawShape( Graphics g ) {

      Polygon octo = new Polygon();
      double theta = Math.toRadians( 45 );
      Point center = new Point( 150, 375 );
      int side = 50;

      int[] octoXPoints = new int[ 8 ];
      int[] octoYPoitns = new int[ 8 ];

      octoXPoints[ 0 ] = (int) center.getX() + side;


   }

}