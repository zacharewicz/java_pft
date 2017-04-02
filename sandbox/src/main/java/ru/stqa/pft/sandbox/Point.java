package ru.stqa.pft.sandbox;
import java.lang.Math;

/**
 * Created by zacharewicz on 2017-03-24.
 */

public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;

  }

  public static void main(String[] args) {

    Point p1 = new Point(2.0, 4.0);
    System.out.println("First point : (" + p1.x + ";" + p1.y + ")");

    Point p2 = new Point(5.0, 8.0);
    System.out.println("Second point : (" + p2.x + ";" + p2.y + ")");

    System.out.println("Distance between 2 points is: " + distance(p1, p2));
  }


  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
  }

}